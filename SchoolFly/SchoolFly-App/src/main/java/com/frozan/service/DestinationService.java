package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.DestinationDao;
import com.frozan.hlo.DestinationHlo;

@Service("destinationService")
public class DestinationService {
	@Autowired
	DestinationDao destinationDao;

	public void save(DestinationHlo destinationHlo) {
		destinationDao.save(destinationHlo);
	}

	public void modify(DestinationHlo destinationHlo) {
		destinationDao.modify(destinationHlo);
	}

	public void delete(DestinationHlo destinationHlo) {
		destinationDao.save(destinationHlo);
	}

	public DestinationHlo findDestinationById(int id) {
		return destinationDao.findDestinationById(id);
	}

	public List<DestinationHlo> getAllRoute() {
		return destinationDao.findAllDestinations();
	}

}
