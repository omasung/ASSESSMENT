package com.sabi.assessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabi.assessment.dao.VideoTypeDAO;
import com.sabi.assessment.model.VideoType;
import com.sabi.assessment.service.VideoTypeService;

@Service
@Transactional
public class VideoTypeServiceImpl implements VideoTypeService {
	
	@Autowired VideoTypeDAO videoTypeDAO;

	@Override
	public void addVideoType(VideoType videoType) {

		videoTypeDAO.addVideoType(videoType);
	}

	@Override
	public void addOrUpdateVideoType(VideoType videoType) {

		videoTypeDAO.addOrUpdateVideoType(videoType);
	}

	@Override
	public void updateVideoType(VideoType videoType) {

		videoTypeDAO.updateVideoType(videoType);
	}

	@Override
	public VideoType getVideoTypeByPk(Long videoTypeId) {

		return videoTypeDAO.getVideoTypeByPk(videoTypeId);
	}

	@Override
	public List<VideoType> getAllVideoType() {

		return videoTypeDAO.getAllVideoType();
	}

	@Override
	public void deleteVideoType(Long videoTypeId) {

		videoTypeDAO.deleteVideoType(videoTypeId);
	}

}
