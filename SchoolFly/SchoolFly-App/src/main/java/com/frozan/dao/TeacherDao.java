package com.frozan.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.frozan.hlo.TeacherHlo;
@Repository("teacherDao")
public class TeacherDao  extends TempletDao{
	
	public void save(TeacherHlo teacherHlo)

	{
		persist(teacherHlo);

	}

	public void modify(TeacherHlo teacherHlo) {
		update(teacherHlo);
	}
	public void delete(TeacherHlo teacherHlo)
	{
		delete(teacherHlo);
	}
	
	public TeacherHlo getTeacherById(int id) {
		Query query = null;
		query = getSession().createQuery("from TeacherHlo t where t.id=id ");
		TeacherHlo teacherHlo = (TeacherHlo) query.uniqueResult();

		return teacherHlo;
	}
	
	public List<TeacherHlo> getAllTeacher()
	{
		List<TeacherHlo> teacherHlos=null;
		Query query=null;
		query=getSession().createQuery("from TeacherHlo");
		teacherHlos=query.list();
		return teacherHlos;
	}

}
