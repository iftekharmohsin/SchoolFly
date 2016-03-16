package com.frozan.service.timetable;


import java.util.List;

import com.frozan.dao.timetable.DailyTimeTableDao;
import com.frozan.dao.timetable.DailyTimeTableHlo;
import com.frozan.model.timetable.DailyTimeTable;

public class DailyTimeTableSvc {

	private DailyTimeTableDao dailyTimeTableDao;
	public DailyTimeTableSvc(){
		//no-op;
	}

	public DailyTimeTableSvc(DailyTimeTableDao dailyTimeTableDao) {
		this.dailyTimeTableDao = dailyTimeTableDao;
	}
	
	public void insert(DailyTimeTable dailyTimeTable){
		
		DailyTimeTableHlo dailyTimeTableHlo=new DailyTimeTableHlo();
		
		dailyTimeTableHlo.setClassId(dailyTimeTable.getClassId());
		
		dailyTimeTableHlo.setDayId(dailyTimeTable.getDayId());
		
		dailyTimeTableHlo.setEndTime(dailyTimeTable.getEndTime());
		
		dailyTimeTableHlo.setStartTime(dailyTimeTable.getStartTime());
		
		dailyTimeTableHlo.setSubject(dailyTimeTable.getSubject());
		
		dailyTimeTableHlo.setTeacher(dailyTimeTable.getTeacher());
		
		dailyTimeTableDao.insert(dailyTimeTableHlo);	
		
	}
	
	public List<DailyTimeTable> getTimeTable(String classId){
		
		List<DailyTimeTable> dailyTimeTableList=null;
		
		dailyTimeTableList=dailyTimeTableDao.getTimeTable(classId);
		return dailyTimeTableList;
	}
}
