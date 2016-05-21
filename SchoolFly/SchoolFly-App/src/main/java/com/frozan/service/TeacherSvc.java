package com.frozan.service;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.StudentDaoImpl;
import com.frozan.dao.impl.TeacherDaoImpl;
import com.frozan.entity.Student;
import com.frozan.hlo.StudentHlo;
import com.frozan.hlo.TeacherHlo;
@Service("teacherSvc")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class TeacherSvc {
	@Autowired
	TeacherDaoImpl teacherDao;
	
	public void save(TeacherHlo teacherHlo)
	{
		teacherDao.save(teacherHlo);
	}
	
	public void modify(TeacherHlo teacherHlo) {
		teacherDao.modify(teacherHlo);
	}
	public void delete(TeacherHlo teacherHlo)
	{
		teacherDao.delete(teacherHlo);
	}
	public TeacherHlo getTeacherById(int id) {
      return teacherDao.getTeacherById(id);
	}
	
	public List<TeacherHlo> getAllTeacher()
	{

         return teacherDao.getAllTeacher();
	}



}
