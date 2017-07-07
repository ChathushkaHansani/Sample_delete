package com.krishantha.eventManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.model.EventType;
import com.krishantha.eventManager.repository.EventRepository;

@Service("eventService")
public class EventServiceImpl implements EventService {
	
	@Autowired
	EventRepository eventRepository;
	/* (non-Javadoc)
	 * @see com.krishantha.eventManager.service.EventService#geEventTypes()
	 */
	public List<EventType> geEventTypes(){
		List<EventType>eventTypes = new ArrayList<EventType>();
		
		EventType eventType= new EventType();
		eventType.setEventType("wedding");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Birthday");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Good bye");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("First Salary");
		eventTypes.add(eventType);
		
		eventType= new EventType();
		eventType.setEventType("Anniversorry");
		eventTypes.add(eventType);
		
		return eventTypes;
	}
	@Transactional
	public Event save(Event event) {
		// TODO Auto-generated method stub
		
		return eventRepository.save(event);

	}
	public List<Event> FetchAllEvents() {
		return eventRepository.findAll();
	}

}
