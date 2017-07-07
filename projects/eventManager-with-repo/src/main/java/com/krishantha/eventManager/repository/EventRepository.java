package com.krishantha.eventManager.repository;

import java.util.List;

import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.model.EventType;

public interface EventRepository {
	
	List<EventType> eventTypes();
	
	Event save(Event event);

	List<Event> fetchAllEvents();
}
