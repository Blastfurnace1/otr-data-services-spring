/*
 */
package com.blastfurnace.otr.data.series.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.blastfurnace.otr.data.respository.generic.GenericRepository;
import com.blastfurnace.otr.data.series.model.Series;
import com.blastfurnace.otr.rest.request.QueryData;

import java.util.List;

public class SeriesRepositoryImpl implements SeriesRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	/** implements the underlying functionality. */
	private GenericRepository<Series> seriesRepo = new GenericRepository<Series>(Series.class, Series.fieldDefinitions);

	@Override
	@Transactional
	public Long getRecordCount(QueryData queryData) {
		return seriesRepo.getRecordCount(em, queryData);
	}

	@Override
	@Transactional
	public List<Series> find(QueryData queryData) {
		return seriesRepo.find(em, queryData);
	}

	public List<Series> find() {
		return seriesRepo.find(em);
	}

}
