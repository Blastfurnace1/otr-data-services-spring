package com.blastfurnace.otr.respository;

import java.util.List;

import com.blastfurnace.otr.model.Series;
import com.blastfurnace.otr.rest.request.QueryData;

public interface SeriesRepositoryCustom {

	 public Long getRecordCount(QueryData queryData);
	 
	 public List<Series> find(QueryData queryData);
	 
	 public List<Series> find();
}
