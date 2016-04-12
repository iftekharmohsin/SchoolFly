package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.SubjectDao;
import com.frozan.hlo.SubjectHlo;

@Service("subjectService")
public class SubjectService {
	@Autowired
	SubjectDao subjectDao;
	public void save(SubjectHlo subjectHlo)
	{
		subjectDao.save(subjectHlo);
	}
	public void modify(SubjectHlo subjectHlo)
	{
		subjectDao.modify(subjectHlo);
	}
	public void delete(SubjectHlo subjectHlo)
	{
		subjectDao.delete(subjectHlo);
	}
	public SubjectHlo findSubjectById(int id)
	{
		return subjectDao.findSubjectById(id);
	}
	public List<SubjectHlo> findAllSubjects()
	{
		return subjectDao.findAllSubjects();
	}

}
