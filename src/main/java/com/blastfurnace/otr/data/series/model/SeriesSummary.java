package com.blastfurnace.otr.data.series.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.blastfurnace.otr.util.reflection.FieldProperties;
import com.blastfurnace.otr.util.reflection.Utils;

import lombok.Data;

@Entity
@XmlRootElement
@Table(name = "series_summary", schema = "otr_mp3")
@Data
public class SeriesSummary {

	// Get the names of all of the fields in the audio file properties class
	public static final List<FieldProperties> fieldDefinitions = Utils.getFieldNames(new SeriesSummary());
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@Column(name = "series_id")
	private Long seriesId;
	
	@NotNull
	@NotEmpty
	private String summary = "";
	
}
