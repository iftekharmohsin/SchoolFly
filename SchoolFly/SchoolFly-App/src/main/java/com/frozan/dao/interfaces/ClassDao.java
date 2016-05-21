package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.ClassHlo;

public interface ClassDao {
	
	void save(ClassHlo classHlo) throws TelentCloudGenericException;
	void modify(ClassHlo classHlo) throws TelentCloudGenericException;
	void delete(ClassHlo classHlo) throws TelentCloudGenericException;
	ClassHlo getClassByid(int id) throws TelentCloudGenericException;
	List<ClassHlo> getAllClasses() throws TelentCloudGenericException;
	
}
