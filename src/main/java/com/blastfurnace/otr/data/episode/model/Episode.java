package com.blastfurnace.otr.data.episode.model;


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
@Table(name = "episodes", schema = "otr_mp3")
@Data
public class Episode {
	
	// Get the names of all of the fields in the audio file properties class
	public static final List<FieldProperties> fieldDefinitions = Utils.getFieldNames(new Episode());

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@NotEmpty
	private Integer exists;
	
	@NotNull
	@Column(name = "episode_number")
	private Integer episodeNumber = 0;
	
	@NotNull
	@Column(name = "broadcast_date")
	private String broadcastDate = "";
	
	@NotNull
	private String title = "";
	
	@NotNull
	private Integer have = 0;
	
	@NotNull
	@Column(name = "series_id")
	private Long seriesId	= 0l;
	
	@NotNull
	@NotEmpty
	@Column(name = "search_title")
	private String searchTitle = "";

}
