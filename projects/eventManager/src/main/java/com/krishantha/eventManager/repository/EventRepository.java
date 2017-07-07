package com.krishantha.eventManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishantha.eventManager.model.Activity;
import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.model.EventType;

public interface EventRepository extends JpaRepository<Event, Long>{
	
	//List<EventType> eventTypes();
	
	//Event save(Event event);

	//List<Event> fetchAllEvents();
}
