package com.blastfurnace.otr.rest.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class GenericRestResponse<T> {
	
	private T payload;
	
	private Long version = 1l;
	
	private Long status = 0l;
	
	private String message = "Result Ok";
	
	private Boolean errorOccured = false;
	
	private List<String> errors = new ArrayList<String>();
	
	public void addError(String err) {
		errors.add(err);
	}
	
	public GenericRestResponse (T payload) {
		this.payload = payload;
	}
}
