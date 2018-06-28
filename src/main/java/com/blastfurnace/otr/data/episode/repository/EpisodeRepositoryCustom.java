package com.blastfurnace.otr.data.episode.repository;

import java.util.List;

import com.blastfurnace.otr.data.episode.model.Episode;
import com.blastfurnace.otr.rest.request.QueryData;

public interface EpisodeRepositoryCustom {

	 public Long getRecordCount(QueryData queryData);
	 
	 public List<Episode> find(QueryData queryData);
	 
	 public List<Episode> find();
}
