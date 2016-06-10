package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.EventDao;
import com.frozan.hlo.EventHlo;

@Repository("eventDao")
public class EventDaoImpl extends AbstractDao  implements EventDao{
	
	// Registering to Logger
				private static final Logger logger = Logger.getLogger(EventDaoImpl.class);

	@Override
	public void save(EventHlo eventHlo) {
		persist(eventHlo);

	}
	@Override
	public void modify(EventHlo eventHlo) {
		update(eventHlo);
	}
	@Override
	public void delete(EventHlo eventHlo) {
		delete(eventHlo);
	}
	@Override
	public EventHlo getEventHloByid(int id) {
		EventHlo eventHlo = null;
		eventHlo = new EventHlo();
		eventHlo = (EventHlo) getSession().createQuery(
				"from EventHlo e where e.id=id").uniqueResult();
		return eventHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<EventHlo> getAllEvents() {
		List<EventHlo> eventHlo = null;
		eventHlo = new ArrayList<EventHlo>();
		eventHlo = getSession().createQuery("from EventHlo ").list();
		return eventHlo;
	}

}
