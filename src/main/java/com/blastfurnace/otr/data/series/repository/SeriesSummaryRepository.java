package com.blastfurnace.otr.data.series.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blastfurnace.otr.data.series.model.SeriesSummary;

public interface SeriesSummaryRepository extends CrudRepository<SeriesSummary, Long> {

	public List<SeriesSummary> findBySeriesId(Long seriesId);
}


