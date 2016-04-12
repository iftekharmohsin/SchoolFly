package com.frozan.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.exception.ExceptionMessage;
import com.frozan.exception.FrozanGenericException;
import com.frozan.hlo.TeacherHlo;
@Repository("teacherDao")
public class TeacherDao  extends TempletDao{
	
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
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		

	}

	public void modify(TeacherHlo teacherHlo) {
		try {
			logger.debug("teacher is about to be updated : "
					+teacherHlo.getFirstName() );
			update(teacherHlo);
			logger.debug("teacher update succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating teacher : "
					+ teacherHlo.getFirstName()  + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while updating teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
		
	}
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
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while deleting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
	
	}
	
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
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selecting teacher: "
					+teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while selecting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selecting teacher : "
					+ teacherHlo.getFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		

		return teacherHlo;
	}
	
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
					throw new FrozanGenericException(
							ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
				} catch (ConstraintViolationException e) {
					logger.error("ConstraintViolationException occured while selecting teacher: "
							+teacherHlos.size() + " : " + e);
					throw new FrozanGenericException(
							ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
				} catch (HibernateException e) {
					logger.error("HibernateException occured while selecting teacher : "
							+ teacherHlos.size() + " : " + e);
					throw new FrozanGenericException(
							ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
				} catch (Exception e) {
					logger.error("Exception occured while selecting teacher : "
							+ teacherHlos.size() + " : " + e);
					throw new FrozanGenericException(e.getMessage());
				}
		
		
		return teacherHlos;
	}

}
