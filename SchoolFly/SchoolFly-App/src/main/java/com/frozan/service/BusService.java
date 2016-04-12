package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.BusDao;
import com.frozan.hlo.BusHlo;

@Service("busService")
public class BusService {
	@Autowired
	BusDao busDao;
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
