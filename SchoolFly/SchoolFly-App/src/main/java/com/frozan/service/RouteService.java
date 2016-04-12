package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.RouteDao;
import com.frozan.hlo.RouteHlo;

@Service("routeService")
public class RouteService {
	@Autowired
	RouteDao routeDao;
	
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
