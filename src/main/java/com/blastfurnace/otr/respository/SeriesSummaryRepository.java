package com.blastfurnace.otr.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.blastfurnace.otr.model.SeriesSummary;

public interface SeriesSummaryRepository extends CrudRepository<SeriesSummary, Long> {

	public List<SeriesSummary> findBySeriesId(Long seriesId);
}


