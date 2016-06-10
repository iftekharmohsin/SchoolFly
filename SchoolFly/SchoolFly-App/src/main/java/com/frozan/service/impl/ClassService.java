package com.frozan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.ClassDaoImpl;
import com.frozan.hlo.ClassHlo;

@Service("classService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class ClassService {
	@Autowired
	ClassDaoImpl classDao;
	public void save(ClassHlo classHlo)
	{
		classDao.save(classHlo);
	}
	public void modify(ClassHlo classHlo)
	{
		classDao.modify(classHlo);
	}
	public void delete(ClassHlo classHlo)
	{
		classDao.delete(classHlo);
	}
	public ClassHlo findClassById(int id)
	{
		
		return classDao.getClassByid(id);
	}
	public List<ClassHlo> findAllClasses()
	{
		return classDao.getAllClasses();
	}
	
	

}
