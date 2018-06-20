/*
 */
package com.blastfurnace.otr.respository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.blastfurnace.otr.model.Episode;
import com.blastfurnace.otr.respository.generic.GenericRepository;
import com.blastfurnace.otr.rest.request.QueryData;

import java.util.List;

public class EpisodeRepositoryImpl implements EpisodeRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	/** implements the underlying functionality. */
	private GenericRepository<Episode> episodeRepo = new GenericRepository<Episode>(Episode.class, Episode.fieldDefinitions);

	@Override
	@Transactional
	public Long getRecordCount(QueryData queryData) {
		return episodeRepo.getRecordCount(em, queryData);
	}

	@Override
	@Transactional
	public List<Episode> find(QueryData queryData) {
		return episodeRepo.find(em, queryData);
	}

	public List<Episode> find() {
		return episodeRepo.find(em);
	}

}
