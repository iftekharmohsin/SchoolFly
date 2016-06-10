package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.BusDaoImpl;
import com.frozan.hlo.BusHlo;

@Service("busService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class BusService {
	@Autowired
	BusDaoImpl busDao;
	public void save(BusHlo busHlo)
	{
		busDao.save(busHlo);
	}
	public void modify(BusHlo busHlo)
	{
		busDao.modify(busHlo);
	}
	public void delete(BusHlo busHlo)
	{
		busDao.delete(busHlo);
	}
	public BusHlo getBusByid(int id) {
		return busDao.findBusByid(id);

	}

	public List<BusHlo> getAllBus() {
		return busDao.findAllBuses();
	}

}
