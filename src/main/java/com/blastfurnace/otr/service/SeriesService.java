package com.blastfurnace.otr.service;

import com.blastfurnace.otr.model.Series;
import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.model.SeriesDataWrapper;

public interface SeriesService {

	Long getResultsCount(QueryData qry);

	Iterable<Series> query(QueryData qry);

	SeriesDataWrapper get(Long id);

	void delete(Long id);

	SeriesDataWrapper save(SeriesDataWrapper series);

}