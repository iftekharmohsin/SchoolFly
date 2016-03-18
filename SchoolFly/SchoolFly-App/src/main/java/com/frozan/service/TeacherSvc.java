package com.frozan.service;

import com.frozan.dao.StudentDao;
import com.frozan.entity.Student;
import com.frozan.hlo.StudentHlo;

public class TeacherSvc {

	private StudentDao teacherdao;
    StudentHlo teacherHlo=new StudentHlo();
	public TeacherSvc(StudentDao teacherDao) {
		super();
		this.teacherdao = teacherDao;
	}
	
	public void insertStudent(Student student){
		teacherHlo.setStdFirstName(student.getStdFirstName());
		teacherHlo.setStdMiddleName(student.getStdMiddleName());
		teacherHlo.setStdLastName(student.getStdLastName());
		teacherHlo.setStdGender(student.getStdGender());
		teacherHlo.setStdDateOfBirth(student.getStdDateOfBirth());
		
		teacherdao.insertStudent(teacherHlo);
	}
	
	public Student fetchStudentById(String studentId){
	
		Student student=null;
		student = teacherdao.fetchStudent(studentId);
		
		return student;
	}

}
