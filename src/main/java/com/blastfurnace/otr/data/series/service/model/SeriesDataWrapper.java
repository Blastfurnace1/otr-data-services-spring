package com.blastfurnace.otr.data.series.service.model;

import java.util.List;

import com.blastfurnace.otr.data.series.model.Series;
import com.blastfurnace.otr.data.series.model.SeriesAlias;
import com.blastfurnace.otr.data.series.model.SeriesSummary;

import lombok.Data;

@Data
public class SeriesDataWrapper {

	public SeriesDataWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	private Series series;
	
	List<SeriesSummary> summaries;

	List<SeriesAlias> alias;
}
