package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.StudentHlo;

public interface StudentDao {
	
	void save(StudentHlo studentHlo) throws TelentCloudGenericException;
	void modify(StudentHlo studentHlo) throws TelentCloudGenericException;
	void delete(StudentHlo studentHlo) throws TelentCloudGenericException;
	List<StudentHlo> getAllStudent() throws TelentCloudGenericException;
	StudentHlo getStudentById(int id) throws TelentCloudGenericException;

}
