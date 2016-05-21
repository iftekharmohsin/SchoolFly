package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.SchoolDaoImpl;
import com.frozan.entity.Admin;
import com.frozan.entity.Event;
import com.frozan.entity.Student;
import com.frozan.hlo.SchoolHlo;
@Service("schoolSvc")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class SchoolSvc {

	@Autowired
	SchoolDaoImpl schoolDao;
	
	public void insertSchool(SchoolHlo schoolHlo){
		//TODO: implementation
	}
	
	/*public School fetchSchool(int id){
		
	}
	*/
	public List<Student> getStudentsOfSchool(String SchoolId){
		//TODO: implementation
		List<Student> studentList=null;
		
		return studentList;
	}
	
	public Student getStudent(String studentId){
		//TODO: implementation
		Student student=null;
		return student;
	}
	public List<Event> getEvents(String schoolId){
		//TODO: implementation
		List<Event> events=null;
		return events;
	}

	public Admin getAdmin(String schoolId){
		//TODO: implementation
		Admin admin=null;
		return admin;
	}

	
}
