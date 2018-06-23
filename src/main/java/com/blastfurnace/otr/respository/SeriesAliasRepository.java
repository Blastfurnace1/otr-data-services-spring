package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blastfurnace.otr.model.SeriesAlias;

public interface SeriesAliasRepository extends CrudRepository<SeriesAlias, Long> {

	public List<SeriesAlias> findBySeriesId(Long seriesId);

}


