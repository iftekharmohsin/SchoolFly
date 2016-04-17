package com.frozan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.ExamTimeTableDao;
import com.frozan.hlo.ExamTimeTableHlo;

@Service("examTimeTableSvc")
public class ExamTimeTableSvc {

	@Autowired
	ExamTimeTableDao examTimeTableDao;

	public void save(ExamTimeTableHlo timeTableHlo) {

		examTimeTableDao.save(timeTableHlo);
	}

	public void modify(ExamTimeTableHlo timeTableHlo) {
		examTimeTableDao.modify(timeTableHlo);
	}

	public void delete(ExamTimeTableHlo timeTableHlo) {
		examTimeTableDao.delete(timeTableHlo);
	}

	/*public ExamTimeTableHlo getTimeTableByid(int id) {
		//return examTimeTableDao.getTimeTableByid(id);

	}*/

	@SuppressWarnings("unchecked")
	public List<ExamTimeTableHlo> getTimeTable() {
		return examTimeTableDao.getTimeTable();
	}

}
