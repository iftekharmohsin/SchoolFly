package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.EventHlo;

public interface EventDao {
	
	 void save(EventHlo eventHlo) throws TelentCloudGenericException;
	 void modify(EventHlo eventHlo) throws TelentCloudGenericException;
	 void delete(EventHlo eventHlo) throws TelentCloudGenericException;
	 EventHlo getEventHloByid(int id) throws TelentCloudGenericException;
	 List<EventHlo> getAllEvents() throws TelentCloudGenericException;
	 

}
