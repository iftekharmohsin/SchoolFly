package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.TransportStaffHlo;

public interface TransportStaffDao {
	void save(TransportStaffHlo transportStaffHlo) throws TelentCloudGenericException;
	void modify(TransportStaffHlo transportStaffHlo) throws TelentCloudGenericException;
	void delete(TransportStaffHlo transportStaffHlo) throws TelentCloudGenericException;
	TransportStaffHlo findTransportStaffById(int id) throws TelentCloudGenericException;
	List<TransportStaffHlo> findAllTransportStaff() throws TelentCloudGenericException;
}
