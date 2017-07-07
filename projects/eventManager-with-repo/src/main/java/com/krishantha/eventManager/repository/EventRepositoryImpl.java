package com.krishantha.eventManager.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.krishantha.eventManager.model.Event;
import com.krishantha.eventManager.model.EventType;


@Repository("eventRepository")
public class EventRepositoryImpl implements EventRepository {

	@PersistenceContext
	private EntityManager entityManager;
	

	public Event save(Event event) {
		
		if(event.getId() == null){
			entityManager.persist(event);
		}else{
			event=entityManager.merge(event);
		}
		
		// TODO Auto-generated method stub
		/*entityManager.persist(event);*/
		entityManager.flush();
		return event;
	}


	public List<EventType> eventTypes() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Event> fetchAllEvents() {
		Query query= entityManager.createQuery("select e from Event e");
		List<Event> events= query.getResultList();
		return events;
	}

}
