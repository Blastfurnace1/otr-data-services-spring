package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blastfurnace.otr.model.EpisodeSummary;

public interface EpisodeSummaryRepository extends CrudRepository<EpisodeSummary, Long> {
	
	public List<EpisodeSummary> findByEpisodeId(Long episodeId);
}


