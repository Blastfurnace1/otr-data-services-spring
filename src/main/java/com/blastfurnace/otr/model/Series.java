package com.blastfurnace.otr.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.blastfurnace.otr.reflection.FieldProperties;
import com.blastfurnace.otr.reflection.Utils;

import lombok.Data;

@Entity
@XmlRootElement
@Table(name = "series", schema = "otr_mp3")
@Data
public class Series {

	// Get the names of all of the fields in the audio file properties class
	public static final List<FieldProperties> fieldDefinitions = Utils.getFieldNames(new Series());
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@NotNull
	@NotEmpty
	@Size(max = 150)
	private String title = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 200)
	@Column(name = "log_file")
	private String logFile = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "run_dates")
	private String runDates = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 120)
	private String genre = "";
	
	
	@NotNull
	@Column(name = "episode_count")
	private Integer episodeCount;
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	private String country = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "broadcast_over")
	private String broadcastOver = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "last_update")
	private String lastUpdate = "";
	
	@NotNull
	@NotEmpty
	@Size(max = 45)
	@Column(name = "program_length")
	private String programLength = "";
	
	@NotNull
	private Integer indexed;
	
	@NotNull
	@NotEmpty
	@Size(max = 150)
	@Column(name = "search_title")
	private String searchTitle = "";
	
	
}
