package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.ClassDao;
import com.frozan.hlo.ClassHlo;

@Service("classService")

public class ClassService {
	@Autowired
	ClassDao classDao;
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
