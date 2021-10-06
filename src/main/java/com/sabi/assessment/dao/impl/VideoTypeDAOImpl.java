package com.sabi.assessment.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sabi.assessment.dao.VideoTypeDAO;
import com.sabi.assessment.model.VideoType;

@Repository
public class VideoTypeDAOImpl implements VideoTypeDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(EntityManagerFactory entityManagerFactory){
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}

	@Override
	public void addVideoType(VideoType videoType) {
		sessionFactory.getCurrentSession().save(videoType);
	}

	@Override
	public void addOrUpdateVideoType(VideoType videoType) {
		sessionFactory.getCurrentSession().saveOrUpdate(videoType);
	}

	@Override
	public void updateVideoType(VideoType videoType) {
		sessionFactory.getCurrentSession().update(videoType);
	}

	@Override
	public VideoType getVideoTypeByPk(Long videoTypeId) {
		return (VideoType) sessionFactory.getCurrentSession().get(VideoType.class, videoTypeId);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<VideoType> getAllVideoType() {
		return sessionFactory.getCurrentSession().createQuery("FROM VideoType").list();
	}
	
	@Override
	public void deleteVideoType(Long videoTypeId) {
		VideoType videoType = (VideoType) sessionFactory.getCurrentSession().load(VideoType.class, videoTypeId);
		if (videoType != null) {
			this.sessionFactory.getCurrentSession().delete(videoType);
		}
	}		
	
}
