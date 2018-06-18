package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.blastfurnace.otr.model.SeriesAlias;

public interface SeriesAliasRepository extends CrudRepository<SeriesAlias, Long> {

	@Query("SELECT p FROM SeriesAlias p WHERE p.seriesId = :sId")
	public List<SeriesAlias> findBySeriesId(@Param("sId") Long sId);

}


