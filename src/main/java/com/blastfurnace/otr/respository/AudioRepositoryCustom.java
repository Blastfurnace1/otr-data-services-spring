package com.blastfurnace.otr.respository;

import java.util.List;

import com.blastfurnace.otr.model.AudioFileProperties;
import com.blastfurnace.otr.rest.request.QueryData;

public interface AudioRepositoryCustom {

	 public Long getRecordCount(QueryData queryData);
	 
	 public List<AudioFileProperties> find(QueryData queryData);
	 
	 public List<AudioFileProperties> find();
}
