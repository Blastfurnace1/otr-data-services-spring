package com.blastfurnace.otr.data.series.repository;

import java.util.List;

import com.blastfurnace.otr.data.series.model.Series;
import com.blastfurnace.otr.rest.request.QueryData;

public interface SeriesRepositoryCustom {

	 public Long getRecordCount(QueryData queryData);
	 
	 public List<Series> find(QueryData queryData);
	 
	 public List<Series> find();
}
