package com.frozan.dao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.frozan.entity.Admin;
import com.frozan.entity.Event;
import com.frozan.entity.School;
import com.frozan.entity.Student;

public class SchoolDao {
	
	private HibernateTemplate hibernateTemplate=null;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insertSchool(School school){
		//TODO:implementation
	}
	public School fetchSchool(String SchoolId){
		//TODO:implementation
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
