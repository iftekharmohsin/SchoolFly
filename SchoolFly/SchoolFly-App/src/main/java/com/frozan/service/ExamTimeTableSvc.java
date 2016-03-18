package com.frozan.service;

import java.util.ArrayList;
// author by iftkar
import java.util.List;

import org.apache.log4j.Logger;

import com.frozan.dao.ExamTimeTableDao;
import com.frozan.entity.ExamTimeTable;
import com.frozan.hlo.ExamTimeTableHlo;
public class ExamTimeTableSvc {
	public static Logger logger=Logger.getLogger(ExamTimeTable.class);

	private ExamTimeTableDao examTimeTableDao;

	public ExamTimeTableSvc(ExamTimeTableDao examTimeTableDao) {
       logger.info("inside the dao method");
		this.examTimeTableDao = examTimeTableDao;
	}

	public void insert(ExamTimeTable examTimeTable) {
		logger.info("inside the dao method");

		ExamTimeTableHlo examTimeTableHlo = new ExamTimeTableHlo();

		examTimeTableHlo.setExamtimeTableId(examTimeTable.getExamTimeTableId());
		examTimeTableHlo.setClassId(examTimeTable.getClassId());

		examTimeTableHlo.setExamDay(examTimeTable.getExamDay());

		examTimeTableHlo.setEndTime(examTimeTable.getEndTime());

		examTimeTableHlo.setStartTime(examTimeTable.getStartTime());

		examTimeTableHlo.setSubject(examTimeTable.getSubject());

		examTimeTableDao.insert(examTimeTableHlo);
	}

	public List<ExamTimeTable> getExamTimeTable(String classId) {
		List<ExamTimeTable> examTimeTableList = null;
		//examTimeTableList = new ArrayList<ExamTimeTable>();
		examTimeTableList =examTimeTableDao.getExamTimeTable(classId);
		return examTimeTableList;

	}
	
	
	

}
