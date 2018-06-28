package com.blastfurnace.otr.data.episode.service.model;

import java.util.List;

import com.blastfurnace.otr.data.episode.model.Episode;
import com.blastfurnace.otr.data.episode.model.EpisodeSummary;

import lombok.Data;

@Data
public class EpisodeDataWrapper {

	public EpisodeDataWrapper() {
		// TODO Auto-generated constructor stub
	}
	
	private Episode episode;
	
	List<EpisodeSummary> summaries;

}
