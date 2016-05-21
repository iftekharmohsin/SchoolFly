package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.DestinationHlo;

public interface DestinationDao {

	void save(DestinationHlo destinationHlo) throws TelentCloudGenericException;
	void modify(DestinationHlo destinationHlo) throws TelentCloudGenericException;
	void delete(DestinationHlo destinationHlo) throws TelentCloudGenericException;
	DestinationHlo findDestinationById(int studentId) throws TelentCloudGenericException;
	List<DestinationHlo> findAllDestinations() throws TelentCloudGenericException;
	
}
