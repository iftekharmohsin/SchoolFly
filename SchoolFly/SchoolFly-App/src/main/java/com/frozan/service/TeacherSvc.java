package com.frozan.service;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.StudentDao;
import com.frozan.dao.TeacherDao;
import com.frozan.entity.Student;
import com.frozan.hlo.StudentHlo;
import com.frozan.hlo.TeacherHlo;
@Service("teacherSvc")
public class TeacherSvc {
	@Autowired
	TeacherDao teacherDao;
	
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
