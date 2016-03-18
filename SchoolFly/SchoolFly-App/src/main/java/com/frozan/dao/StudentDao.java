package com.frozan.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.frozan.entity.Student;
import com.frozan.hlo.StudentHlo;

public class StudentDao {

	private HibernateTemplate hibernateTemplate = null;

	public StudentDao(HibernateTemplate hibernateTemplate) {
		// super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insertStudent(StudentHlo studentHlo) {
		// TODO: IMPLEMENTATION
	}

	public Student fetchStudent(String studentId) {
		// TODO: IMPPLEMENTATION
		Student student = null;
		return student;

	}
}
