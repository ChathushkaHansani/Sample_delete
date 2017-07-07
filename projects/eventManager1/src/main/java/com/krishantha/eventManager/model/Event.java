package com.krishantha.eventManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Event {

	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min=5, max=10, message="Event name should between 5 and 10 characters")
	private String eventName;
	
	String eventType;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	
	
}
