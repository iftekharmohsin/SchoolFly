package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.DestinationDao;
import com.frozan.hlo.DestinationHlo;

@Repository("destinationDao")
public class DestinationDaoImpl extends AbstractDao implements DestinationDao {
	
	// Registering to Logger
			private static final Logger logger = Logger.getLogger(DestinationDaoImpl.class);

	@Override
	public void save(DestinationHlo destinationHlo)
	{
		persist(destinationHlo);
	}
	@Override
	public void modify(DestinationHlo destinationHlo)
	{
		update(destinationHlo);
	}
	@Override
	public void delete(DestinationHlo destinationHlo)
	{
		delete(destinationHlo);
	}
	@Override
	public DestinationHlo findDestinationById(int studentId)
	{
		DestinationHlo destinationHlo = null;
		destinationHlo = new DestinationHlo();
		destinationHlo = (DestinationHlo) getSession().createQuery(
				"from DestinationHlo d where d.id=id").uniqueResult();//change with student id
		return destinationHlo;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<DestinationHlo> findAllDestinations()
	{
		List<DestinationHlo> destinationHlos = null;
		destinationHlos = new ArrayList<DestinationHlo>();
		destinationHlos = getSession().createQuery("from DestinationHlo ").list();

		return destinationHlos;
	}

}
