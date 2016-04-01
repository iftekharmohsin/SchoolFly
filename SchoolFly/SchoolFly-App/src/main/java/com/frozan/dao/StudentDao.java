package com.frozan.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.frozan.hlo.StudentHlo;

@Repository("studentDao")
public class StudentDao extends TempletDao {
	
	public void save(StudentHlo studentHlo){
		persist(studentHlo);
	}
	
	public void modify(StudentHlo studentHlo){
		update(studentHlo);
	}
	
	public void delete(StudentHlo studentHlo){
      		delete(studentHlo);
	}
	public int get()
	{
		return 1;
	}
	
    public List<StudentHlo> getAllStudent(){
    
    	Query query=getSession().createQuery("From StudentHlo");
    	List<StudentHlo> students= query.list();
    	return students;
    }
    
    public StudentHlo getStudentById(int id){
    	Query query=getSession().createQuery("From StudentHlo s where s:id=id");
    	StudentHlo student=(StudentHlo) query.uniqueResult();
    	return student;
    }
}
