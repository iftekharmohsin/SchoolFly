package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.StudentDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.SectionHlo;
import com.frozan.hlo.StudentHlo;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {

	// Registering to Logger
		private static final Logger logger = Logger.getLogger(StudentDaoImpl.class);

	@Override
	public void save(StudentHlo studentHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+studentHlo.getId()+" " );
			persist(studentHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+studentHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+studentHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+studentHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+studentHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		
	}
	@Override
	public void modify(StudentHlo studentHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+studentHlo.getId()+" " );
			update(studentHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+studentHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+studentHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+studentHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+studentHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}

	}
	@Override
	public void delete(StudentHlo studentHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+studentHlo.getId()+" " );
			delete(studentHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+studentHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+studentHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+studentHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+studentHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+studentHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<StudentHlo> getAllStudent() {
		List<StudentHlo> students = null;
		students = new ArrayList<StudentHlo>();
		try {	
			logger.debug("sectionHlo is about to be saved : "+students.size()+" " );
			Query query = getSession().createQuery("From StudentHlo");
			students = query.list();
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+students.size()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+students.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+students.size()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+students.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+students.size()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+students.size()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
				return students;
	}
	@Override
	public StudentHlo getStudentById(int id) {
		StudentHlo student = null;
		Query query = getSession().createQuery("From StudentHlo s where s.id=:id");
		query.setParameter("id",id);
		student = (StudentHlo) query.uniqueResult();
			return student;
	}
}
