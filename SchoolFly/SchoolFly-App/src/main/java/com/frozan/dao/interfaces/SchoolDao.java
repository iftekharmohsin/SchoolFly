package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.SchoolHlo;

public interface SchoolDao {
	void save(SchoolHlo schoolHlo)throws TelentCloudGenericException;
	void modify(SchoolHlo schoolHlo) throws TelentCloudGenericException;
	void delete(SchoolHlo schoolHlo) throws TelentCloudGenericException;
	SchoolHlo findRouteByid(int id) throws TelentCloudGenericException;
	List<SchoolHlo> findAllSchool() throws TelentCloudGenericException;
}
