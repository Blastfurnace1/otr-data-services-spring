package com.blastfurnace.otr.service;

import java.util.List;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.model.EpisodeDataWrapper;

public interface EpisodeService {

	Long getResultsCount(QueryData qry);

	Iterable<Episode> query(QueryData qry);

	EpisodeDataWrapper get(Long id);
	
	List<EpisodeDataWrapper> getSeriesEpisodes(Long seriesId);

	void delete(Long id);

	EpisodeDataWrapper save(EpisodeDataWrapper series);

}