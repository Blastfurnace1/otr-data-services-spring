package com.blastfurnace.otr.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blastfurnace.otr.model.AudioFileProperties;
import com.blastfurnace.otr.respository.AudioRepository;
import com.blastfurnace.otr.rest.request.QueryData;

@Component("AudioService")
public class AudioServiceImpl implements AudioService {

	@Autowired
	private AudioRepository repository;
	
	@Override
	public Long getResultsCount(QueryData qry) {
		return repository.getRecordCount(qry);
	}

	@Override
	public Iterable<AudioFileProperties> query(QueryData qry) {
		return repository.find(qry);
	}

	@Override
	public AudioFileProperties get(Long id) {
		
		Optional<AudioFileProperties> audio = repository.findById(id);
		if (audio.isPresent()) {
			return audio.get();
		} 
		
		return null;
	}

	@Override
	public void delete(Long  id) {
		repository.deleteById(id);
	}

	@Override
	public AudioFileProperties save(AudioFileProperties series) {
		return repository.save(series);
	}
}
