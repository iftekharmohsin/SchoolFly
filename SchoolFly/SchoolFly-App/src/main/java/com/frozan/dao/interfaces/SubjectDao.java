package com.frozan.dao.interfaces;

import java.util.List;

import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.SubjectHlo;

public interface SubjectDao {

	void save(SubjectHlo subjectHlo) throws TelentCloudGenericException;
	void modify(SubjectHlo subjectHlo) throws TelentCloudGenericException;
	void delete(SubjectHlo subjectHlo) throws TelentCloudGenericException;
	SubjectHlo findSubjectById(int id) throws TelentCloudGenericException;
	List<SubjectHlo> findAllSubjects() throws TelentCloudGenericException;
}
