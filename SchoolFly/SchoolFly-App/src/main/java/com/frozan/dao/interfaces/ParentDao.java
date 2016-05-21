package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.ParentHlo;

public interface ParentDao {

	boolean save(ParentHlo parentHlo) throws TelentCloudGenericException;
	void modify(ParentHlo parentHlo) throws TelentCloudGenericException;
	void delete(ParentHlo parentHlo) throws TelentCloudGenericException;
	List<ParentHlo> getParentById(int studentId) throws TelentCloudGenericException;
	ParentHlo findById(int id) throws TelentCloudGenericException;
	ParentHlo findByMail(String email)throws TelentCloudGenericException;
	List<ParentHlo> getAllParents()throws TelentCloudGenericException;
	
}
