package com.krishantha.eventManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.eventManager.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long>{
	//Activity save(Activity activity);
}
