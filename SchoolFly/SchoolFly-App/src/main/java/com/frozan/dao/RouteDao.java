package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.RouteHlo;

@Repository("routeDao")

public class RouteDao  extends TempletDao{
	
	public void save(RouteHlo routeHlo)
	{
		persist(routeHlo);
	}
	public void modify(RouteHlo routeHlo) {
		update(routeHlo);
	}

	public void delete(RouteHlo routeHlo) {
		delete(routeHlo);
	}
	
	public RouteHlo findRouteByid(int id) {
		RouteHlo routeHlo = null;
		routeHlo = new RouteHlo();
		routeHlo = (RouteHlo) getSession().createQuery(
				"from RouteHlo r where r.id=id").uniqueResult();
		return routeHlo;

	}

	@SuppressWarnings("unchecked")
	public List<RouteHlo> findAllRoute() {
		List<RouteHlo> routeHlo = null;
		routeHlo = new ArrayList<RouteHlo>();
		routeHlo = getSession().createQuery("from RouteHlo ")
				.list();
		return routeHlo;
	}
	

}
