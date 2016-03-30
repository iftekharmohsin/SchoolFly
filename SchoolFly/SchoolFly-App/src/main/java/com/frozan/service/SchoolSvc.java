package com.frozan.service;

import java.util.List;

import com.frozan.dao.SchoolDao;
import com.frozan.entity.Admin;
import com.frozan.entity.Event;
import com.frozan.entity.School;
import com.frozan.entity.Student;
import com.frozan.hlo.SchoolHlo;

public class SchoolSvc {

	private SchoolDao schoolDao;
	private SchoolHlo schoolHlo =new SchoolHlo();
	
	public SchoolSvc(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}
	
	public void insertSchool(School school){
		//TODO: implementation
	}
	
	public School fetchSchool(String schoolId){
		//TODO: implementation
		School school=null;
		
		return school;
	}
	
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
