package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.TransportStaffDao;
import com.frozan.hlo.TransportStaffHlo;

@Service("transportStaffSerrvice")

public class TransportStaffSerrvice {
	
	
	@Autowired
	TransportStaffDao transportStaffDao;
	public void save(TransportStaffHlo transportStaffHlo)
	{
		transportStaffDao.save(transportStaffHlo);
	}
	public void modify(TransportStaffHlo transportStaffHlo)
	{
		transportStaffDao.modify(transportStaffHlo);
	}
	public void delete(TransportStaffHlo transportStaffHlo)
	{
		
		transportStaffDao.delete(transportStaffHlo);
	}
	public TransportStaffHlo getTransportStaffById(int id)
	{
		return transportStaffDao.findTransportStaffById(id);
	}
	public List<TransportStaffHlo> findAllTransportStaff()
	{
		return transportStaffDao.findAllTransportStaff();
	}

}
