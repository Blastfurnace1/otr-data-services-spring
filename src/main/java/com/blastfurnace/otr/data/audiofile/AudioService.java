package com.blastfurnace.otr.data.audiofile;

import java.util.List;

import com.blastfurnace.otr.data.audiofile.model.AudioFileProperties;
import com.blastfurnace.otr.rest.request.QueryData;

public interface AudioService {

	public Long getResultsCount(QueryData qry);

	public Iterable<AudioFileProperties> query(QueryData qry);

	public AudioFileProperties get(Long id);

	public void delete(Long id);

	public AudioFileProperties save(AudioFileProperties series);
	
	public List<AudioFileProperties> findByDirectoryFilenameAndDiscId(String directory, String filename, String discId);

}