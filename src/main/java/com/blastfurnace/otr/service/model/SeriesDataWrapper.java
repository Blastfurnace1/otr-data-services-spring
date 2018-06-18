package com.blastfurnace.otr.service.model;

import java.util.List;

import com.blastfurnace.otr.model.Series;
import com.blastfurnace.otr.model.SeriesAlias;
import com.blastfurnace.otr.model.SeriesSummary;

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
