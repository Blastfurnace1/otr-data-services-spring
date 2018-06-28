package com.blastfurnace.otr.data.series.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blastfurnace.otr.data.series.model.SeriesAlias;

public interface SeriesAliasRepository extends CrudRepository<SeriesAlias, Long> {

	public List<SeriesAlias> findBySeriesId(Long seriesId);

}


