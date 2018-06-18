package com.blastfurnace.otr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.AudioService;


/**
 * Servlet implementation class FileServer
 */
@WebServlet("/ping")
public class PingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AudioService service;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	// Set response content type
    	response.setContentType("text/html");

    	Long count = new Long(-5l);
    	try {
    		Map<String,String> map = new HashMap<String,String>();
    		QueryData qry = new QueryData(map);
    		count = service.getResultsCount(qry);
    	} catch (Exception e) {
    		count = new Long(-5l);
    	}

    	PrintWriter out = response.getWriter();

    	if (count != null && count > 0) {
    		out.println("Service Status OK");
    	} else {
    		out.println("Service Status NOT OK - ");
    	}

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
