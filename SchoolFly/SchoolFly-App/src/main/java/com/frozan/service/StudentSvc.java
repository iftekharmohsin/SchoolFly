package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.AllergiesDao;
import com.frozan.dao.BusDao;
import com.frozan.dao.DailyTimeTableDao;
import com.frozan.dao.DestinationDao;
import com.frozan.dao.ExamTimeTableDao;
import com.frozan.dao.ParentDao;
import com.frozan.dao.StudentDao;
import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.BusHlo;
import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.hlo.DestinationHlo;
import com.frozan.hlo.ExamTimeTableHlo;
import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.SectionHlo;
import com.frozan.hlo.StudentHlo;

@Service("studentSvc")
@Transactional
public class StudentSvc {
   
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private AllergiesDao allergiesDao;
	
	@Autowired
	private BusDao busDao;
	
	@Autowired
	private DailyTimeTableDao dailyTimeTableDao;
	
	@Autowired
	private ExamTimeTableDao examTimeTableDAo;
	
	@Autowired
	private DestinationDao destinationDao;
	
	@Autowired
	private ParentDao parentDao;
	
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
