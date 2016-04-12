package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.DestinationHlo;

@Repository("destinationDao")
public class DestinationDao extends TempletDao {
	public void save(DestinationHlo destinationHlo)
	{
		persist(destinationHlo);
	}
	public void modify(DestinationHlo destinationHlo)
	{
		update(destinationHlo);
	}
	public void delete(DestinationHlo destinationHlo)
	{
		delete(destinationHlo);
	}
	public DestinationHlo findDestinationById(int id)
	{
		DestinationHlo destinationHlo = null;
		destinationHlo = new DestinationHlo();
		destinationHlo = (DestinationHlo) getSession().createQuery(
				"from DestinationHlo d where d.id=id").uniqueResult();
		return destinationHlo;
	}
	@SuppressWarnings("unchecked")
	public List<DestinationHlo> findAllDestinations()
	{
		List<DestinationHlo> destinationHlos = null;
		destinationHlos = new ArrayList<DestinationHlo>();
		destinationHlos = getSession().createQuery("from DestinationHlo ").list();

		return destinationHlos;
	}

}
