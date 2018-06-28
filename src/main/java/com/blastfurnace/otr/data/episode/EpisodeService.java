package com.blastfurnace.otr.data.episode;

import java.util.List;

import com.blastfurnace.otr.data.ATypicalDataService;
import com.blastfurnace.otr.data.episode.model.Episode;
import com.blastfurnace.otr.data.episode.service.model.EpisodeDataWrapper;

public interface EpisodeService extends ATypicalDataService<Episode> {

	List<EpisodeDataWrapper> getSeriesEpisodes(Long seriesId);

	EpisodeDataWrapper save(EpisodeDataWrapper series);

	EpisodeDataWrapper getComplex(Long id);

}