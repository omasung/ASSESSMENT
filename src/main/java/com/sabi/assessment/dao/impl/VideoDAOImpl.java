package com.sabi.assessment.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sabi.assessment.dao.VideoDAO;
import com.sabi.assessment.model.Video;

@Repository
public class VideoDAOImpl implements VideoDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(EntityManagerFactory entityManagerFactory){
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}

	@Override
	public void addVideo(Video video) {
		sessionFactory.getCurrentSession().save(video);
	}

	@Override
	public void addOrUpdateVideo(Video video) {
		sessionFactory.getCurrentSession().saveOrUpdate(video);
	}

	@Override
	public void updateVideo(Video video) {
		sessionFactory.getCurrentSession().update(video);
	}

	@Override
	public Video getVideoByPk(Long videoId) {
		return (Video) sessionFactory.getCurrentSession().get(Video.class, videoId);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Video> getAllVideo() {
		return sessionFactory.getCurrentSession().createQuery("FROM Video").list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Video> getAllVideoPaginated(int pageSize, int pageNumber) {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Video ORDER BY id DESC")
				
				.setFirstResult(pageSize * pageNumber)//page number = pageSize * pageNumber
				.setMaxResults(pageSize)//pageSize
				
				.list();				
	}	
	
	@Override
	public void deleteVideo(Long videoId) {
		Video video = (Video) sessionFactory.getCurrentSession().load(Video.class, videoId);
		if (video != null) {
			this.sessionFactory.getCurrentSession().delete(video);
		}
	}		
	
}
