package com.blastfurnace.otr.respository;

import java.util.List;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.rest.request.QueryData;

public interface EpisodeRepositoryCustom {

	 public Long getRecordCount(QueryData queryData);
	 
	 public List<Episode> find(QueryData queryData);
	 
	 public List<Episode> find();
}
