package com.frozan.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.frozan.entity.DailyTimeTable;
import com.frozan.hlo.DailyTimeTableHlo;


public class DailyTimeTableDao {

	private HibernateTemplate hibernateTemplate;

	public DailyTimeTableDao(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(DailyTimeTableHlo dailyTimeTableHlo){
		hibernateTemplate.save(dailyTimeTableHlo);
	}

	public List<DailyTimeTable> getTimeTable(String classId,String dayId){
		final String DAYTIEMTABLE="from DailyTimeTableHlo where classId=? AND DAY=?";   
		List<DailyTimeTable> dailyTimeTablesList=null;
		List<DailyTimeTable> o=hibernateTemplate.find(DAYTIEMTABLE, new Object[]{classId,dayId},DailyTimeTable.class));
		
		//hibernateTemplate.find(DAYTIEMTABLE,new Object[]{classId,dayId});
		return dailyTimeTablesList;
	}
}
