package com.blastfurnace.otr.service;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.model.EpisodeDataWrapper;

public interface EpisodeService {

	Long getResultsCount(QueryData qry);

	Iterable<Episode> query(QueryData qry);

	EpisodeDataWrapper get(Long id);

	void delete(Long id);

	EpisodeDataWrapper save(EpisodeDataWrapper series);

}