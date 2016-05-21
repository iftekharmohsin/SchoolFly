package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.ExamTimeTableDao;
import com.frozan.hlo.ExamTimeTableHlo;

@Repository("examTimeTableDao")

public class ExamTimeTableDaoImpl extends AbstractDao implements ExamTimeTableDao {
	
	// Registering to Logger
		private static final Logger logger = Logger.getLogger(ExamTimeTableDaoImpl.class);

	@Override
	public void save(ExamTimeTableHlo timeTableHlo)
	{
		
		persist(timeTableHlo);
	}
	@Override
	public void modify(ExamTimeTableHlo timeTableHlo)
	{
		update(timeTableHlo);
	}
	@Override
	public void delete(ExamTimeTableHlo timeTableHlo)
	{
		delete(timeTableHlo);
	}
	@Override
	public List<ExamTimeTableHlo> getTimeTableByid(int sectionId)
	{
		List<ExamTimeTableHlo> timeTableHlo=null;
		timeTableHlo=new ArrayList<ExamTimeTableHlo>();
		timeTableHlo=getSession().createQuery("from ExamTimeTableHlo e where e.id=id").list();//change with section id
		return timeTableHlo;	
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<ExamTimeTableHlo> getTimeTable()
	{
		List<ExamTimeTableHlo> tableHlos=null;
		tableHlos=new ArrayList<ExamTimeTableHlo>();
		tableHlos=getSession().createQuery("from ExamTimeTableHlo").list();
		return tableHlos;
	}


}
