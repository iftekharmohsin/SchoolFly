package com.frozan.service.timetable;

import java.util.List;

import com.frozan.dao.timetable.DailyTimeTableDao;
import com.frozan.dao.timetable.DailyTimeTableHlo;
import com.frozan.dao.timetable.ExamTimeTableDao;
import com.frozan.dao.timetable.ExamTimeTableHlo;
import com.frozan.model.timetable.DailyTimeTable;
import com.frozan.model.timetable.ExamTimeTable;

public class ExamTimeTableSvc {

	private ExamTimeTableDao examTimeTableDao;
	
	public ExamTimeTableSvc(ExamTimeTableDao examTimeTableDao) {
		this.examTimeTableDao = examTimeTableDao;
	}
	
	public void insert(ExamTimeTable examTimeTable){
		
		ExamTimeTableHlo examTimeTableHlo=new ExamTimeTableHlo();
		
		examTimeTableHlo.setExamtimeTableId(examTimeTable.getExamTimeTableId());
		examTimeTableHlo.setClassId(examTimeTable.getClassId());
		
		examTimeTableHlo.setExamDay(examTimeTable.getExamDay());
		
		examTimeTableHlo.setEndTime(examTimeTable.getEndTime());
		
		examTimeTableHlo.setStartTime(examTimeTable.getStartTime());
		
		examTimeTableHlo.setSubject(examTimeTable.getSubject());
		
		examTimeTableDao.insert(examTimeTableHlo);	
		
	}
	
	public List<ExamTimeTable> getTimeTable(String classId){
		
		List<ExamTimeTable> examTimeTableList=null;
		
		examTimeTableList=examTimeTableDao.getExamTimeTable(classId);
		return examTimeTableList;
	}

}
