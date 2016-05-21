package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.BusHlo;

public interface BusDao {
  
	void save(BusHlo busHlo) throws TelentCloudGenericException;
	void modify(BusHlo busHlo)throws TelentCloudGenericException;
	void delete(BusHlo busHlo) throws TelentCloudGenericException;
	BusHlo findBusByid(int id)throws TelentCloudGenericException;
	List<BusHlo> findAllBuses() throws TelentCloudGenericException;
	
}
