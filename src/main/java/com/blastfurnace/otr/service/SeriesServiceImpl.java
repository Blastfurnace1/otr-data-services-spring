package com.blastfurnace.otr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blastfurnace.otr.model.Series;
import com.blastfurnace.otr.model.SeriesAlias;
import com.blastfurnace.otr.model.SeriesSummary;
import com.blastfurnace.otr.respository.SeriesAliasRepository;
import com.blastfurnace.otr.respository.SeriesRepository;
import com.blastfurnace.otr.respository.SeriesSummaryRepository;
import com.blastfurnace.otr.rest.request.QueryData;
import com.blastfurnace.otr.service.model.SeriesDataWrapper;

@Component("SeriesService")
public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeriesRepository seriesRepository;
	
	@Autowired
	private SeriesSummaryRepository seriesSummaryRepository;
	
	@Autowired
	private SeriesAliasRepository seriesAliasRepository;

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.SeriesService#getResultsCount(com.blastfurnace.otr.rest.request.QueryData)
	 */
	@Override
	public Long getResultsCount(QueryData qry) {
		return seriesRepository.getRecordCount(qry);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.SeriesService#query(com.blastfurnace.otr.rest.request.QueryData)
	 */
	@Override
	public Iterable<Series> query(QueryData qry) {
		return seriesRepository.find(qry);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.SeriesService#get(java.lang.Long)
	 */
	@Override
	public SeriesDataWrapper get(Long id) {
		SeriesDataWrapper theSeries = new SeriesDataWrapper();
		
		Optional<Series> series = seriesRepository.findById(id);
		if (series.isPresent()) {
			theSeries.setSeries(series.get());
			theSeries.setSummaries(seriesSummaryRepository.findBySeriesId(id));
			theSeries.setAlias(seriesAliasRepository.findBySeriesId(id));
		} 
		
		return theSeries;
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.SeriesService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long  id) {
		seriesRepository.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.blastfurnace.otr.service.SeriesService#save(com.blastfurnace.otr.model.Series)
	 */
	@Override
	public SeriesDataWrapper save(SeriesDataWrapper series) {
		SeriesDataWrapper theSeries = new SeriesDataWrapper();
		Series newSeries = seriesRepository.save(series.getSeries());
		if (newSeries != null) {
			theSeries.setSeries(newSeries);
			List<SeriesSummary> newSummaries = new ArrayList<SeriesSummary>();
			List<SeriesSummary> summaries = series.getSummaries();
			for (SeriesSummary summary : summaries) {
				newSummaries.add(seriesSummaryRepository.save(summary));
			}
			theSeries.setSummaries(newSummaries);
			
			List<SeriesAlias> newAlias = new ArrayList<SeriesAlias>();
			List<SeriesAlias> alias = series.getAlias();
			for (SeriesAlias als : alias) {
				newAlias.add(seriesAliasRepository.save(als));
			}
			theSeries.setAlias(newAlias);
		}
		
		return theSeries;
	}
}
