package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.RouteHlo;

public interface RouteDao {

	void save(RouteHlo routeHlo)throws TelentCloudGenericException;
	void modify(RouteHlo routeHlo) throws TelentCloudGenericException;
	void delete(RouteHlo routeHlo) throws TelentCloudGenericException;
	RouteHlo findRouteByid(int id) throws TelentCloudGenericException;
	List<RouteHlo> findAllRoute() throws TelentCloudGenericException;
	
	
}
