package com.sabi.assessment.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.sabi.assessment.utility.Types;

@Entity
@Table(name = "videotype")

public class VideoType implements Serializable {

	private static final long serialVersionUID = 1L;

    @GenericGenerator(
      name = "videotype-sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "videotype_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )

	@Id
    @GeneratedValue(generator = "videotype-sequence-generator")
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Types type;
    
    @Column(name = "typeRate")
    private Double typeRate;
    
    @Column(name = "maxAge")
    private Integer maxAge;
    
    @Column(name = "releaseYear")
    private LocalDate releaseYear;
    
	public VideoType() {
    }

    public VideoType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public Double getTypeRate() {
		return typeRate;
	}

	public void setTypeRate(Double typeRate) {
		this.typeRate = typeRate;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	public LocalDate getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(LocalDate releaseYear) {
		this.releaseYear = releaseYear;
	}

}
