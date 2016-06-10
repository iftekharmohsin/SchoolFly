package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.RouteDao;
import com.frozan.hlo.RouteHlo;

@Repository("routeDao")

public class RouteDaoImpl  extends AbstractDao implements RouteDao{
	
	// Registering to Logger
				private static final Logger logger = Logger.getLogger(ParentDaoImpl.class);
	@Override
	public void save(RouteHlo routeHlo)
	{
		persist(routeHlo);
	} 
	@Override
	public void modify(RouteHlo routeHlo) {
		update(routeHlo);
	}
	@Override
	public void delete(RouteHlo routeHlo) {
		delete(routeHlo);
	}
	@Override
	public RouteHlo findRouteByid(int id) {
		RouteHlo routeHlo = null;
		routeHlo = new RouteHlo();
		routeHlo = (RouteHlo) getSession().createQuery(
				"from RouteHlo r where r.id=id").uniqueResult();
		return routeHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<RouteHlo> findAllRoute() {
		List<RouteHlo> routeHlo = null;
		routeHlo = new ArrayList<RouteHlo>();
		routeHlo = getSession().createQuery("from RouteHlo ")
				.list();
		return routeHlo;
	}
	

}
