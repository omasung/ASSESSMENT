package com.sabi.assessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabi.assessment.dao.VideoDAO;
import com.sabi.assessment.model.Video;
import com.sabi.assessment.service.VideoService;

@Service
@Transactional
public class VideoServiceImpl implements VideoService {
	
	@Autowired VideoDAO videoDAO;

	@Override
	public void addVideo(Video video) {

		videoDAO.addVideo(video);
	}

	@Override
	public void addOrUpdateVideo(Video video) {

		videoDAO.addOrUpdateVideo(video);
	}

	@Override
	public void updateVideo(Video video) {

		videoDAO.updateVideo(video);
	}

	@Override
	public Video getVideoByPk(Long videoId) {

		return videoDAO.getVideoByPk(videoId);
	}

	@Override
	public List<Video> getAllVideo() {

		return videoDAO.getAllVideo();
	}

	@Override
	public List<Video> getAllVideoPaginated(int pageSize, int pageNumber) {

		return videoDAO.getAllVideoPaginated(pageSize, pageNumber);
	}
	
	@Override
	public void deleteVideo(Long videoId) {

		videoDAO.deleteVideo(videoId);
	}

}
