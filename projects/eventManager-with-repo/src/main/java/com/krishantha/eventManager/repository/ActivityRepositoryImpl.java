package com.krishantha.eventManager.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.krishantha.eventManager.model.Activity;

@Repository("activityRepository")
public class ActivityRepositoryImpl implements ActivityRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Activity save(Activity activity) {
		entityManager.persist(activity);
		entityManager.flush();
		return activity;
	}

}
