package com.blastfurnace.otr.data.series;

import com.blastfurnace.otr.data.ATypicalDataService;
import com.blastfurnace.otr.data.series.model.Series;
import com.blastfurnace.otr.data.series.service.model.SeriesDataWrapper;

public interface SeriesService extends ATypicalDataService<Series> {

	SeriesDataWrapper save(SeriesDataWrapper series);

	SeriesDataWrapper getComplex(Long id);
	
	Series save(Series series);

}
