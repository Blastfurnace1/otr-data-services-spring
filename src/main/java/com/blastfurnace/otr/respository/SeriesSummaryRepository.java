package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.blastfurnace.otr.model.SeriesSummary;

public interface SeriesSummaryRepository extends CrudRepository<SeriesSummary, Long> {

	@Query("SELECT p FROM SeriesSummary p WHERE p.seriesId = :sId")
	public List<SeriesSummary> findBySeriesId(@Param("sId") Long sId);
}


