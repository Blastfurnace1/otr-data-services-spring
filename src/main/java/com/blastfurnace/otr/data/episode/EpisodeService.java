package com.blastfurnace.otr.data.episode;

import java.util.List;

import com.blastfurnace.otr.data.episode.model.Episode;
import com.blastfurnace.otr.data.episode.service.model.EpisodeDataWrapper;
import com.blastfurnace.otr.rest.request.QueryData;

public interface EpisodeService {

	Long getResultsCount(QueryData qry);

	Iterable<Episode> query(QueryData qry);

	EpisodeDataWrapper get(Long id);
	
	List<EpisodeDataWrapper> getSeriesEpisodes(Long seriesId);

	void delete(Long id);

	EpisodeDataWrapper save(EpisodeDataWrapper series);

}