package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.frozan.entity.DailyTimeTable;
import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.hlo.ExamTimeTableHlo;

@Repository("dailyTimeTableDao")
public class DailyTimeTableDao extends TempletDao {

	public void save(DailyTimeTableHlo dailyTimeTableHlo) {
		persist(dailyTimeTableHlo);

	}

	public void modify(DailyTimeTableHlo dailyTimeTableHlo) {
		update(dailyTimeTableHlo);
	}

	public void delete(DailyTimeTableHlo dailyTimeTableHlo) {
		delete(dailyTimeTableHlo);
	}

	public DailyTimeTableHlo getTimeTableByid(int id) {
		DailyTimeTableHlo dailyTimeTableHlo = null;
		dailyTimeTableHlo = new DailyTimeTableHlo();
		dailyTimeTableHlo = (DailyTimeTableHlo) getSession().createQuery(
				"from DailyTimeTableHlo d where d.id=id").uniqueResult();
		return dailyTimeTableHlo;

	}

	@SuppressWarnings("unchecked")
	public List<DailyTimeTableHlo> getTimeTable() {
		List<DailyTimeTableHlo> dailyTimeTableHlo = null;
		dailyTimeTableHlo = new ArrayList<DailyTimeTableHlo>();
		dailyTimeTableHlo = getSession().createQuery("from DailyTimeTableHlo ")
				.list();
		return dailyTimeTableHlo;
	}
}
