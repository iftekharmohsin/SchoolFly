package com.frozan.service.timetable;


import java.util.List;

import com.frozan.dao.timetable.timetable.DailyTimeTableDao;
import com.frozan.entity.timetable.*;
import com.frozan.hlo.timetable.DailyTimeTableHlo;

public class DailyTimeTableSvc {

	private DailyTimeTableDao dailyTimeTableDao;
	DailyTimeTableHlo dailyTimeTableHlo=new DailyTimeTableHlo();
	public DailyTimeTableSvc(){
		//no-op;
	}

	public DailyTimeTableSvc(DailyTimeTableDao dailyTimeTableDao) {
		this.dailyTimeTableDao = dailyTimeTableDao;
	}
	
	public void insert(DailyTimeTable dailyTimeTable){
		
		dailyTimeTableHlo.setClassId(dailyTimeTable.getClassId());
		
		dailyTimeTableHlo.setDayId(dailyTimeTable.getDayId());
		
		dailyTimeTableHlo.setEndTime(dailyTimeTable.getEndTime());
		
		dailyTimeTableHlo.setStartTime(dailyTimeTable.getStartTime());
		
		dailyTimeTableHlo.setSubject(dailyTimeTable.getSubject());
		
		dailyTimeTableHlo.setTeacher(dailyTimeTable.getTeacher());
		
		dailyTimeTableDao.insert(dailyTimeTableHlo);	
		
	}
	
	public List<DailyTimeTable> getTimeTable(String classId,String dayId){
		
		List<DailyTimeTable> dailyTimeTableList=null;
		
		dailyTimeTableList=dailyTimeTableDao.getTimeTable(classId, dayId);
		return dailyTimeTableList;
	}
}
