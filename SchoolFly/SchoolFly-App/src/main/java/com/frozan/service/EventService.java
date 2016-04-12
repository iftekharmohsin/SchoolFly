package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.EventDao;
import com.frozan.hlo.EventHlo;

@Service("eventService")
public class EventService {
	@Autowired
	EventDao eventDao;
	
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
