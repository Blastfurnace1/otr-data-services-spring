package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.blastfurnace.otr.model.EpisodeSummary;

public interface EpisodeSummaryRepository extends CrudRepository<EpisodeSummary, Long> {

	@Query("SELECT p FROM EpisodeSummary p WHERE p.seriesId = :sId")
	public List<EpisodeSummary> findBySeriesId(@Param("sId") Long sId);
}


