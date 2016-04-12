package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.EventHlo;

@Repository("eventDao")
public class EventDao extends TempletDao {
	public void save(EventHlo eventHlo) {
		persist(eventHlo);

	}

	public void modify(EventHlo eventHlo) {
		update(eventHlo);
	}

	public void delete(EventHlo eventHlo) {
		delete(eventHlo);
	}

	public EventHlo getEventHloByid(int id) {
		EventHlo eventHlo = null;
		eventHlo = new EventHlo();
		eventHlo = (EventHlo) getSession().createQuery(
				"from EventHlo e where e.id=id").uniqueResult();
		return eventHlo;

	}

	@SuppressWarnings("unchecked")
	public List<EventHlo> getAllEvents() {
		List<EventHlo> eventHlo = null;
		eventHlo = new ArrayList<EventHlo>();
		eventHlo = getSession().createQuery("from EventHlo ").list();
		return eventHlo;
	}

}
