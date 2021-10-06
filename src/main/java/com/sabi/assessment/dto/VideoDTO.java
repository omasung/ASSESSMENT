package com.sabi.assessment.dto;

public class VideoDTO {
	
	private String id;
	private String title;
	private String type;
	private String typeRate;
	private String genre;
	private String maxAge;
	private String releaseYear;
	
	public VideoDTO(String id, String title, String type, String typeRate, String genre, String maxAge,
			String releaseYear) {
		
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.typeRate = typeRate;
		this.genre = genre;
		this.maxAge = maxAge;
		this.releaseYear = releaseYear;
		
	}

	public VideoDTO() {
		
	}	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeRate() {
		return typeRate;
	}

	public void setTypeRate(String typeRate) {
		this.typeRate = typeRate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(String maxAge) {
		this.maxAge = maxAge;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
    
}
