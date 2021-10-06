package com.sabi.assessment.dao;

import java.util.List;

import com.sabi.assessment.model.VideoType;

public interface VideoTypeDAO {

	void addVideoType(VideoType videoType);

	void addOrUpdateVideoType(VideoType videoType);

	void updateVideoType(VideoType videoType);

	VideoType getVideoTypeByPk(Long videoTypeId);

	List<VideoType> getAllVideoType();

	void deleteVideoType(Long videoTypeId);

}
