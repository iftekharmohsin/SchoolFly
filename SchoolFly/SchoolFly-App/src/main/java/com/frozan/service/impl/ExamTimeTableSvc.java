package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.ExamTimeTableDaoImpl;
import com.frozan.hlo.ExamTimeTableHlo;

@Service("examTimeTableSvc")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class ExamTimeTableSvc {

	@Autowired
	ExamTimeTableDaoImpl examTimeTableDao;

	public void save(ExamTimeTableHlo timeTableHlo) {

		examTimeTableDao.save(timeTableHlo);
	}

	public void modify(ExamTimeTableHlo timeTableHlo) {
		examTimeTableDao.modify(timeTableHlo);
	}

	public void delete(ExamTimeTableHlo timeTableHlo) {
		examTimeTableDao.delete(timeTableHlo);
	}

	public List<ExamTimeTableHlo> getTimeTableByid(int id) {
		return examTimeTableDao.getTimeTableByid(id);

	}

	@SuppressWarnings("unchecked")
	public List<ExamTimeTableHlo> getTimeTable() {
		return examTimeTableDao.getTimeTable();
	}

}
