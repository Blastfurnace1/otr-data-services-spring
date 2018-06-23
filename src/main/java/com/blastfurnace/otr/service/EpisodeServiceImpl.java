package com.blastfurnace.otr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.model.EpisodeSummary;
import com.blastfurnace.otr.respository.EpisodeRepository;
import com.blastfurnace.otr.respository.EpisodeSummaryRepository;
import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.model.EpisodeDataWrapper;

@Component("EpisodeService")
public class EpisodeServiceImpl implements EpisodeService {

	@Autowired
	private EpisodeRepository episodeRepository;
	
	@Autowired
	private EpisodeSummaryRepository episodeSummaryRepository;
	
	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.EpisodeService#getResultsCount(com.blastfurnace.otr.rest.request.QueryData)
	 */
	@Override
	public Long getResultsCount(QueryData qry) {
		return episodeRepository.getRecordCount(qry);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.EpisodeService#query(com.blastfurnace.otr.rest.request.QueryData)
	 */
	@Override
	public Iterable<Episode> query(QueryData qry) {
		return episodeRepository.find(qry);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.EpisodeService#get(java.lang.Long)
	 */
	@Override
	public EpisodeDataWrapper get(Long id) {
		EpisodeDataWrapper theEpisode = new EpisodeDataWrapper();
		
		Optional<Episode> episode = episodeRepository.findById(id);
		if (episode.isPresent()) {
			theEpisode.setEpisode(episode.get());
			theEpisode.setSummaries(episodeSummaryRepository.findByEpisodeId(theEpisode.getEpisode().getId()));
		} 
		
		return theEpisode;
	}
	
	@Override
	public List<EpisodeDataWrapper> getSeriesEpisodes(Long seriesId) {
		List<EpisodeDataWrapper> theEpisodes = new ArrayList<EpisodeDataWrapper>();
		
		List<Episode> episodes = episodeRepository.findBySeriesId(seriesId);
		for (Episode episode : episodes) {
			EpisodeDataWrapper theEpisode = new EpisodeDataWrapper();
			theEpisode.setEpisode(episode);
			theEpisode.setSummaries(episodeSummaryRepository.findByEpisodeId(episode.getId()));
			theEpisodes.add(theEpisode);
		} 
		
		return theEpisodes;
	}


	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.EpisodeService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long  id) {
		episodeRepository.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.EpisodeService#save(com.blastfurnace.otr.model.Episode)
	 */
	@Override
	public EpisodeDataWrapper save(EpisodeDataWrapper episode) {
		EpisodeDataWrapper theEpisode = new EpisodeDataWrapper();
		Episode newEpisode = episodeRepository.save(episode.getEpisode());
		if (newEpisode != null) {
			theEpisode.setEpisode(newEpisode);
			List<EpisodeSummary> newSummaries = new ArrayList<EpisodeSummary>();
			List<EpisodeSummary> summaries = episode.getSummaries();
			for (EpisodeSummary summary : summaries) {
				newSummaries.add(episodeSummaryRepository.save(summary));
			}
			theEpisode.setSummaries(newSummaries);
			
		}
		
		return theEpisode;
	}
}
