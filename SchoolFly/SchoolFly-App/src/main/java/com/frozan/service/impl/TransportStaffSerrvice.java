package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.TransportStaffDaoImpl;
import com.frozan.hlo.TransportStaffHlo;

@Service("transportStaffSerrvice")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class TransportStaffSerrvice {
	
	@Autowired
	TransportStaffDaoImpl transportStaffDao;
	
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
