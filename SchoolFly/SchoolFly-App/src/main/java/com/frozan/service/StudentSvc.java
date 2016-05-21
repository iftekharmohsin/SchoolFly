package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.AllergiesDaoImpl;
import com.frozan.dao.impl.BusDaoImpl;
import com.frozan.dao.impl.DailyTimeTableDaoImpl;
import com.frozan.dao.impl.DestinationDaoImpl;
import com.frozan.dao.impl.ExamTimeTableDaoImpl;
import com.frozan.dao.impl.ParentDaoImpl;
import com.frozan.dao.impl.StudentDaoImpl;
import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.BusHlo;
import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.hlo.DestinationHlo;
import com.frozan.hlo.ExamTimeTableHlo;
import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.SectionHlo;
import com.frozan.hlo.StudentHlo;

@Service("studentSvc")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class StudentSvc {
   
	@Autowired
	private StudentDaoImpl studentDao;
	
	@Autowired
	private AllergiesDaoImpl allergiesDao;
	
	@Autowired
	private BusDaoImpl busDao;
	
	@Autowired
	private DailyTimeTableDaoImpl dailyTimeTableDao;
	
	@Autowired
	private ExamTimeTableDaoImpl examTimeTableDAo;
	
	@Autowired
	private DestinationDaoImpl destinationDao;
	
	@Autowired
	private ParentDaoImpl parentDao;
	
	public void save(StudentHlo studentHlo){
      studentDao.save(studentHlo);
		
	}
	public int get()
	{
		return 1;
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
	
	public List<AllergiesHlo> getAllergies(){
		return allergiesDao.findAllAllergies();
	}
	
	public void addAllergies(AllergiesHlo allergiesHlo){
		allergiesDao.save(allergiesHlo);
	}
	public BusHlo getBus(int id){
		return busDao.findBusByid(id);
	}
	
	public DailyTimeTableHlo getDailyTimeTable(int sectionId){
		return dailyTimeTableDao.getTimeTableByid(sectionId);
	}
	
	public List<ExamTimeTableHlo> getExamTimeTable(int sectionId){
		return examTimeTableDAo.getTimeTableByid(sectionId);
	}
	
	public DestinationHlo getDestination(int studentId){
		return destinationDao.findDestinationById(studentId);
	}
	
	public List<ParentHlo> getParent(int studentId){
		return parentDao.getParentById(studentId);
	}
	
	//setters
	public void setparent(ParentHlo parentHlo, int studentId){
		parentDao.save(parentHlo);
	}
	
	public void setDestination(DestinationHlo destinationHlo, int studentId){
		destinationDao.save(destinationHlo);
	}
	
}
