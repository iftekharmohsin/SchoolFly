package com.frozan.dao.timetable;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.frozan.model.timetable.ExamTimeTable;

public class ExamTimeTableDao {

	

	private HibernateTemplate hibernateTemplate;

	public ExamTimeTableDao(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(ExamTimeTableHlo examTimeTableHlo){
		hibernateTemplate.save(examTimeTableHlo);
	}

	public List<ExamTimeTable> getExamTimeTable(String classId){
		List<ExamTimeTable> examTimeTablesList=null;
		examTimeTablesList=hibernateTemplate.find("from ExamTimeTableHlo where classId=?",new Object[]{classId});
		
		return examTimeTablesList;
	}
}
