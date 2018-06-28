package com.blastfurnace.otr.data.episode.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blastfurnace.otr.data.episode.model.EpisodeSummary;

public interface EpisodeSummaryRepository extends CrudRepository<EpisodeSummary, Long> {
	
	public List<EpisodeSummary> findByEpisodeId(Long episodeId);
}


