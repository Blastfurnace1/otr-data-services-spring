package com.blastfurnace.otr.service.model;

import java.util.List;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.model.EpisodeSummary;

import lombok.Data;

@Data
public class EpisodeDataWrapper {

	public EpisodeDataWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	private Episode episode;
	
	List<EpisodeSummary> summaries;

}
