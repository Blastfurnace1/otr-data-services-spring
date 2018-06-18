package com.blastfurnace.otr.service;

import com.blastfurnace.otr.model.AudioFileProperties;
import com.blastfurnace.otr.rest.request.QueryData;

public interface AudioService {

	Long getResultsCount(QueryData qry);

	Iterable<AudioFileProperties> query(QueryData qry);

	AudioFileProperties get(Long id);

	void delete(Long id);

	AudioFileProperties save(AudioFileProperties series);

}