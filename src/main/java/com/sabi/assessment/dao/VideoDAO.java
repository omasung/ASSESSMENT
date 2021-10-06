package com.sabi.assessment.dao;

import java.util.List;

import com.sabi.assessment.model.Video;

public interface VideoDAO {

	void addVideo(Video video);

	void addOrUpdateVideo(Video video);

	void updateVideo(Video video);

	Video getVideoByPk(Long videoId);

	List<Video> getAllVideo();
	
	List<Video> getAllVideoPaginated(int pageSize, int pageNumber);

	void deleteVideo(Long videoId);

}
