package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.BusDao;
import com.frozan.hlo.BusHlo;

@Repository("busDao")
public class BusDaoImpl extends AbstractDao implements BusDao {
	
	    // Registering to Logger
		private static final Logger logger = Logger
				.getLogger(BusDaoImpl.class);
	@Override
	public void save(BusHlo busHlo) {
		persist(busHlo);
	}
	@Override
	public void modify(BusHlo busHlo) {
		update(busHlo);
		
	}
	@Override
	public void delete(BusHlo busHlo) {
		delete(busHlo);
	}
	
	@Override
	public BusHlo findBusByid(int id) {
		BusHlo busHlo = null;
		busHlo = new BusHlo();
		busHlo = (BusHlo) getSession().createQuery(
				"from BusHlo b where b.id=id").uniqueResult();
				return busHlo;
		

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<BusHlo> findAllBuses() {
		List<BusHlo> busHlo = null;
		busHlo=new ArrayList<BusHlo>();
		busHlo = getSession().createQuery("from BusHlo ")
				.list();
			return busHlo;
	}
}
