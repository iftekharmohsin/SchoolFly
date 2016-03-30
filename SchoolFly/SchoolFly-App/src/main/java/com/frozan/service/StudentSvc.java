package com.frozan.service;

import com.frozan.dao.StudentDao;
import com.frozan.entity.Student;
import com.frozan.hlo.StudentHlo;


public class StudentSvc {

	private StudentDao studentDao;
    StudentHlo studentHlo=new StudentHlo();
	public StudentSvc(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	
	public void insertStudent(Student student){
		studentHlo.setStdFirstName(student.getStdFirstName());
		studentHlo.setStdMiddleName(student.getStdMiddleName());
		studentHlo.setStdLastName(student.getStdLastName());
		studentHlo.setStdGender(student.getStdGender());
		studentHlo.setStdDateOfBirth(student.getStdDateOfBirth());
		
		studentDao.insertStudent(studentHlo);
	}
	
	public Student fetchStudentById(String studentId){
	
		Student student=null;
		student = studentDao.fetchStudent(studentId);
		
		return student;
	}

}
