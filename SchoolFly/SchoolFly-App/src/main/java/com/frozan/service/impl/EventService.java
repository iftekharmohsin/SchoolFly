package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.EventDaoImpl;
import com.frozan.hlo.EventHlo;

@Service("eventService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class EventService {
	@Autowired
	EventDaoImpl eventDao;
	
	public void save(EventHlo eventHlo)
	{
		eventDao.save(eventHlo);
	}
    public void modify(EventHlo eventHlo)
    {
    	eventDao.modify(eventHlo);
    }
    public void delete(EventHlo eventHlo)
    {
    	eventDao.delete(eventHlo);
    }
    public EventHlo findEventById(int id)
    {
    	return eventDao.getEventHloByid(id);
    }
    public List<EventHlo> getAllEvents()
    {
    	return eventDao.getAllEvents();
    }
}
