package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.DestinationDaoImpl;
import com.frozan.hlo.DestinationHlo;

@Service("destinationService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class DestinationService {
	@Autowired
	DestinationDaoImpl destinationDao;

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
