package com.frozan.service;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.StudentDao;
import com.frozan.hlo.StudentHlo;

@Service("studentSvc")
public class StudentSvc {
   
	@Autowired
	StudentDao studentDao;
	
	public void save(StudentHlo studentHlo){
      studentDao.save(studentHlo);
		
	}
	public int get()
	{
		return studentDao.get();
	}
	
	public void modify(StudentHlo studentHlo){
		studentDao.modify(studentHlo);
	}
	
	public void delete(StudentHlo studentHlo){
		studentDao.delete(studentHlo);
	}
	
    public List<StudentHlo> getAllStudent(){
    	return studentDao.getAllStudent();
    }
    
    public StudentHlo getStudentById(int id){
    	return studentDao.getStudentById(id);
    }
	
	
}
