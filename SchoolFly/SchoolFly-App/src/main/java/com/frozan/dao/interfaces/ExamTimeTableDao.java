package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.ExamTimeTableHlo;

public interface ExamTimeTableDao {

	void save(ExamTimeTableHlo timeTableHlo)throws TelentCloudGenericException;
	void modify(ExamTimeTableHlo timeTableHlo)throws TelentCloudGenericException;
	void delete(ExamTimeTableHlo timeTableHlo)throws TelentCloudGenericException;
	List<ExamTimeTableHlo> getTimeTableByid(int sectionId) throws TelentCloudGenericException;
	List<ExamTimeTableHlo> getTimeTable()throws TelentCloudGenericException;
}
