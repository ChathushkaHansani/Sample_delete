package com.krishantha.eventManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.eventManager.model.Activity;
import com.krishantha.eventManager.repository.ActivityRepository;
@Service("activityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	ActivityRepository activityRepository;
	@Transactional
	public Activity save(Activity activity) {

		return activityRepository.save(activity);
	}

}
