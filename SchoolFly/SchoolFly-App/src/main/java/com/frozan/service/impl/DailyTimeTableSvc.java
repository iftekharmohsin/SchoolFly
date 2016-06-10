package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.DailyTimeTableDaoImpl;
import com.frozan.entity.DailyTimeTable;
import com.frozan.hlo.DailyTimeTableHlo;

@Service("dailyTimeTableSvc")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class DailyTimeTableSvc {
	@Autowired
	DailyTimeTableDaoImpl dailyTimeTableDao;

	public void save(DailyTimeTableHlo dailyTimeTableHlo) {
		dailyTimeTableDao.save(dailyTimeTableHlo);

	}

	public void modify(DailyTimeTableHlo dailyTimeTableHlo) {
		dailyTimeTableDao.modify(dailyTimeTableHlo);
	}

	public void delete(DailyTimeTableHlo dailyTimeTableHlo) {
		dailyTimeTableDao.delete(dailyTimeTableHlo);
	}

	public DailyTimeTableHlo getTimeTableByid(int id) {
		return dailyTimeTableDao.getTimeTableByid(id);

	}

	@SuppressWarnings("unchecked")
	public List<DailyTimeTableHlo> getTimeTable() {
		return dailyTimeTableDao.getTimeTable();
	}

}
