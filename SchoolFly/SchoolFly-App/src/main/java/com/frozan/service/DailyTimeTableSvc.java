package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.DailyTimeTableDao;
import com.frozan.entity.DailyTimeTable;
import com.frozan.hlo.DailyTimeTableHlo;

@Service("dailyTimeTableSvc")
public class DailyTimeTableSvc {
	@Autowired
	DailyTimeTableDao dailyTimeTableDao;

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
