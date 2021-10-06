package com.sabi.assessment.service;

import java.util.List;

import com.sabi.assessment.model.VideoType;

public interface VideoTypeService {

	void addVideoType(VideoType videoType);

	void addOrUpdateVideoType(VideoType videoType);

	void updateVideoType(VideoType videoType);

	VideoType getVideoTypeByPk(Long videoTypeId);

	List<VideoType> getAllVideoType();

	void deleteVideoType(Long videoTypeId);
	
}
