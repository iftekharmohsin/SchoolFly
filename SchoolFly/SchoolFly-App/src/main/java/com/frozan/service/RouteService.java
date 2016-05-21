package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.RouteDaoImpl;
import com.frozan.hlo.RouteHlo;

@Service("routeService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class RouteService {
	@Autowired
	RouteDaoImpl routeDao;
	
	public void save(RouteHlo routeHlo)
	{
		routeDao.save(routeHlo);
	}
	
	public void modify(RouteHlo routeHlo)
	{
		routeDao.modify(routeHlo);
	}
	public void delete(RouteHlo routeHlo)
	{
		routeDao.delete(routeHlo);
	}
	
	public RouteHlo getRouteById(int id)
	{
		return routeDao.findRouteByid(id);
	}
	public List<RouteHlo> getAllRoute()
	{
		return routeDao.findAllRoute();
	}

}
