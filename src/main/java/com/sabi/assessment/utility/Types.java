package com.sabi.assessment.utility;

public enum Types {
	
	Regular_Movie("Regular Movie"), 
	Children_Movie("Children’s Movie"), 
	New_Release("New Release");
	
	private String videoType;

	private Types(String videoType) {
		this.videoType = videoType;
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

}
