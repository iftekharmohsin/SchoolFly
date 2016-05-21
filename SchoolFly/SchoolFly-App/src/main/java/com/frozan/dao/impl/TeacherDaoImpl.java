package com.frozan.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.TeacherDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.TeacherHlo;
@Repository("teacherDao")
public class TeacherDaoImpl  extends AbstractDao implements TeacherDao{
	
	// Registering to Logger
		private static final Logger logger = Logger.getLogger(TeacherDaoImpl.class);

		
	@Override	
	public void save(TeacherHlo teacherHlo)

	{
		try {
			logger.debug("teacher is about to be saved : "
					+teacherHlo.getFirstName() );
			persist(teacherHlo);
			logger.debug("teacher saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving teacher : "
					+ teacherHlo.getFirstName()  + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		

	}
	@Override
	public void modify(TeacherHlo teacherHlo) {
		try {
			logger.debug("teacher is about to be updated : "
					+teacherHlo.getFirstName() );
			update(teacherHlo);
			logger.debug("teacher update succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating teacher : "
					+ teacherHlo.getFirstName()  + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while updating teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		
		
	}
	@Override
	public void delete(TeacherHlo teacherHlo)
	{
		try {
			logger.debug("teacher is about to be deleted: "
					+teacherHlo.getFirstName() );
			delete(teacherHlo);
			logger.debug("teacher deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting teacher : "
					+ teacherHlo.getFirstName()  + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while deleting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
	
	}
	@Override
	public TeacherHlo getTeacherById(int id) {
		TeacherHlo teacherHlo=null;
		try {
			logger.debug("teacher is about to selected: "
					+teacherHlo.getFirstName() );
			Query query = null;
			query = getSession().createQuery("from TeacherHlo t where t.id=id ");
			 teacherHlo = (TeacherHlo) query.uniqueResult();
			logger.debug("teacher selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selecting teacher : "
					+ teacherHlo.getFirstName()  + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selecting teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while selecting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selecting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		

		return teacherHlo;
	}
	@Override
	public List<TeacherHlo> getAllTeacher()
	{
		List<TeacherHlo> teacherHlos=null;
				try {
					logger.debug("teacher is about to selected: "
							+teacherHlos.size() );
					        Query query=null;
							query=getSession().createQuery("from TeacherHlo");
							teacherHlos=query.list();
					logger.debug("teachers selected succussfully");
				} catch (JDBCConnectionException e) {
					logger.error("JDBCConnectionException occured while selecting teacher : "
							+ teacherHlos.size() + " : " + e);
					throw new TelentCloudGenericException(
							DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
				} catch (ConstraintViolationException e) {
					logger.error("ConstraintViolationException occured while selecting teacher: "
							+teacherHlos.size() + " : " + e);
					throw new TelentCloudGenericException(
							DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
				} catch (HibernateException e) {
					logger.error("HibernateException occured while selecting teacher : "
							+ teacherHlos.size() + " : " + e);
					throw new TelentCloudGenericException(
							DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
				} catch (Exception e) {
					logger.error("Exception occured while selecting teacher : "
							+ teacherHlos.size() + " : " + e);
					throw new TelentCloudGenericException(e.getMessage());
				}
		
		
		return teacherHlos;
	}

}
