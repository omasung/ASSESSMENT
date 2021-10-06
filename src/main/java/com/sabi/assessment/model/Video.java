package com.sabi.assessment.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.sabi.assessment.utility.Genres;

@Entity
@Table(name = "video")

public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

    @GenericGenerator(
      name = "video-sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "video_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )

	@Id
    @GeneratedValue(generator = "video-sequence-generator")
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "videoType")
    private VideoType videoType;
    
    @Column(name = "videoGenre")
    @Enumerated(EnumType.STRING)
    private Genres videoGenre;
    
	public Video() {
    }

    public Video(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @OneToOne
    @JoinColumn(name = "videoType", referencedColumnName = "id")
	public VideoType getVideoType() {
		return videoType;
	}

	public void setVideoType(VideoType videoType) {
		this.videoType = videoType;
	}

	public Genres getVideoGenre() {
		return videoGenre;
	}

	public void setVideoGenre(Genres videoGenre) {
		this.videoGenre = videoGenre;
	}

}
