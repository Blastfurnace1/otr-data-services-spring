package com.blastfurnace.otr.data.series;

import com.blastfurnace.otr.data.series.model.Series;
import com.blastfurnace.otr.data.series.service.model.SeriesDataWrapper;
import com.blastfurnace.otr.rest.request.QueryData;

public interface SeriesService {

	Long getResultsCount(QueryData qry);

	Iterable<Series> query(QueryData qry);

	SeriesDataWrapper get(Long id);

	void delete(Long id);

	SeriesDataWrapper save(SeriesDataWrapper series);

}