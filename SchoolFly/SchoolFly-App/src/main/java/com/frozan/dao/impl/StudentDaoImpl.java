package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.StudentDao;
import com.frozan.hlo.StudentHlo;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {

	// Registering to Logger
		private static final Logger logger = Logger.getLogger(StudentDaoImpl.class);

	@Override
	public void save(StudentHlo studentHlo) {
		persist(studentHlo);
		
	}
	@Override
	public void modify(StudentHlo studentHlo) {
		update(studentHlo);

	}
	@Override
	public void delete(StudentHlo studentHlo) {
		delete(studentHlo);
		

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<StudentHlo> getAllStudent() {
		List<StudentHlo> students = null;
		Query query = getSession().createQuery("From StudentHlo");
		students = new ArrayList<StudentHlo>();
		students = query.list();
				return students;
	}
	@Override
	public StudentHlo getStudentById(int id) {
		StudentHlo student = null;
		Query query = getSession().createQuery("From StudentHlo s where s.id=:id");
		query.setParameter("id",id);
		student = (StudentHlo) query.uniqueResult();
			return student;
	}
}
