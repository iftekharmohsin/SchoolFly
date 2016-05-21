package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.SubjectDaoImpl;
import com.frozan.hlo.SubjectHlo;

@Service("subjectService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class SubjectService {
	@Autowired
	SubjectDaoImpl subjectDao;
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
