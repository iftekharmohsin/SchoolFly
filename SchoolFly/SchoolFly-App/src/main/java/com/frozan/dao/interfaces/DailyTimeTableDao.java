package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.DailyTimeTableHlo;

public interface DailyTimeTableDao {

	void save(DailyTimeTableHlo dailyTimeTableHlo) throws TelentCloudGenericException;
	void modify(DailyTimeTableHlo dailyTimeTableHlo) throws TelentCloudGenericException;
	void delete(DailyTimeTableHlo dailyTimeTableHlo)throws TelentCloudGenericException;
	DailyTimeTableHlo getTimeTableByid(int id)throws TelentCloudGenericException; 
	List<DailyTimeTableHlo> getTimeTable()throws TelentCloudGenericException;
	
	
}
