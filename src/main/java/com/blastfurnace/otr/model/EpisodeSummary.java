package com.blastfurnace.otr.model;

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

import com.blastfurnace.otr.reflection.FieldProperties;
import com.blastfurnace.otr.reflection.Utils;

import lombok.Data;

@Entity
@XmlRootElement
@Table(name = "series_summary", schema = "otr_mp3")
@Data
public class EpisodeSummary {

	// Get the names of all of the fields in the audio file properties class
	public static final List<FieldProperties> fieldDefinitions = Utils.getFieldNames(new EpisodeSummary());
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@NotNull
	@Column(name = "series_id")
	private Long seriesId;
	
	@NotNull
	@Column(name = "episode_id")
	private Integer episodeId	= 0;
	
	@NotNull
	@NotEmpty
	private String summary = "";
	
	private Integer number = 0;
	
	private String title = "";
	
	@NotNull
	@Column(name = "broadcast_date")
	private String broadcastDate = "";
	
	private String length = "";
	
	private String broadcaster = "";
	
	private String sponsor = "";
	
	@NotNull
	@Column(name = "afrs_disc")
	private Integer afrsDisc;

	@NotNull
	@Column(name = "reference_id")
	private Integer referenceId;
	
	@NotNull
	@Column(name = "afrs_program_name")
	private String afrsProgramName = "";
	
	@NotNull
	@Column(name = "music_fill_for_local_commercial_insert")
	private Integer musicFills;
	
	@NotNull
	@Column(name = "commercials_added_locally")
	private Integer commercialsAddedLocally;
	
	@NotNull
	@Column(name = "commercials_deleted")
	private Integer commercialsDeleted;
	
	@NotNull
	private Integer auditioned;
	
	@NotNull
	@Column(name = "recording_date")
	private Integer recordingDate;
	
	@NotNull
	@Column(name = "recording_notes")
	private String recordingNotes = "";
	
}