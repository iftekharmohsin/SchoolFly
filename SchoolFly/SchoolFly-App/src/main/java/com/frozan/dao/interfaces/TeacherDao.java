package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.TeacherHlo;

public interface TeacherDao {
	
	void save(TeacherHlo teacherHlo)throws TelentCloudGenericException;
	void modify(TeacherHlo teacherHlo) throws TelentCloudGenericException;
	void delete(TeacherHlo teacherHlo)throws TelentCloudGenericException;
	TeacherHlo getTeacherById(int id) throws TelentCloudGenericException;
	List<TeacherHlo> getAllTeacher() throws TelentCloudGenericException;

}
