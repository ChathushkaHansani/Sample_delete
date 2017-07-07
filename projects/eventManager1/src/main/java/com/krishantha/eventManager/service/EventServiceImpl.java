package com.krishantha.eventManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.krishantha.eventManager.model.EventType;

@Service("eventService")
public class EventServiceImpl implements EventService {
	
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

}
