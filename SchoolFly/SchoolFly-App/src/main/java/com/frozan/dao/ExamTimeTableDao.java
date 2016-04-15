package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.frozan.entity.ExamTimeTable;
import com.frozan.hlo.ExamTimeTableHlo;

@Repository("examTimeTableDao")

public class ExamTimeTableDao extends TempletDao {
	
	public void save(ExamTimeTableHlo timeTableHlo)
	{
		
		persist(timeTableHlo);
	}
	
	public void modify(ExamTimeTableHlo timeTableHlo)
	{
		update(timeTableHlo);
	}
	
	public void delete(ExamTimeTableHlo timeTableHlo)
	{
		delete(timeTableHlo);
	}
	
	public List<ExamTimeTableHlo> getTimeTableByid(int sectionId)
	{
		List<ExamTimeTableHlo> timeTableHlo=null;
		timeTableHlo=new ArrayList<ExamTimeTableHlo>();
		timeTableHlo=getSession().createQuery("from ExamTimeTableHlo e where e.id=id").list();//change with section id
		return timeTableHlo;	
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ExamTimeTableHlo> getTimeTable()
	{
		List<ExamTimeTableHlo> tableHlos=null;
		tableHlos=new ArrayList<ExamTimeTableHlo>();
		tableHlos=getSession().createQuery("from ExamTimeTableHlo").list();
		return tableHlos;
	}


}
