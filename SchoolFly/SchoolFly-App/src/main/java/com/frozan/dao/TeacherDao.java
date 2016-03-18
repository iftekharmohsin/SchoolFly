package com.frozan.dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.frozan.entity.Teacher;
import com.frozan.hlo.TeacherHlo;

public class TeacherDao {

	private HibernateTemplate hibernateTemplate = null;

	public TeacherDao(HibernateTemplate hibernateTemplate) {
		// super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insertTeacher(TeacherHlo teacherHlo) {
		// TODO: IMPLEMENTATION
	}

	public Teacher fetchteacher(String teacherId) {
		// TODO: IMPPLEMENTATION
		Teacher  teacher= null;
		return teacher;

	}
}
