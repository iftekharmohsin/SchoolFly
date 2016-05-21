package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.SectionHlo;

public interface SectionDao {

	void save(SectionHlo sectionHlo) throws TelentCloudGenericException;
	void modify(SectionHlo sectionHlo) throws TelentCloudGenericException;
	void delete(SectionHlo sectionHlo) throws TelentCloudGenericException;
	SectionHlo getSectionById(int id) throws TelentCloudGenericException;
	List<SectionHlo> getAllSections() throws TelentCloudGenericException;

}
