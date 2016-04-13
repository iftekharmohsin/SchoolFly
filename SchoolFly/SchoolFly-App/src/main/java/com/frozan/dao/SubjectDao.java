package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.exception.ExceptionMessage;
import com.frozan.exception.FrozanGenericException;
import com.frozan.hlo.SubjectHlo;

@Repository("subjectDao")
public class SubjectDao  extends TempletDao{
	
	public void save(SubjectHlo subjectHlo)
	{  
		persist(subjectHlo);
/*		try {
			logger.debug("subject  is about to be saved : "
					+subjectHlo.getName());
			
			logger.debug("subject saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving subjects : "
					+ subjectHlo.getName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}*/
		
	}
	public void modify(SubjectHlo subjectHlo)
	{
		try {
			logger.debug("subject  is about to be saved : "
					+subjectHlo.getName());
			update(subjectHlo);
			logger.debug("subject saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving subjects : "
					+ subjectHlo.getName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
	}
	public void delete(SubjectHlo subjectHlo)
	{
		try {
			logger.debug("subject  is about to be saved : "
					+subjectHlo.getName());
			delete(subjectHlo);
			logger.debug("subject saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving subjects : "
					+ subjectHlo.getName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
	}
	
	public SubjectHlo findSubjectById(int id)
	{    Query query=null;
		SubjectHlo subjectHlo=null;
		try {
			logger.debug("subject  is about to be saved : "
					+subjectHlo.getName());
			subjectHlo = new SubjectHlo();
			query =  getSession().createQuery(
					"from SubjectHlo sb where sb.id=:id");
			query.setParameter("id",id);
			subjectHlo=(SubjectHlo)query.uniqueResult();

			logger.debug("subject saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving subjects : "
					+ subjectHlo.getName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
		return subjectHlo;
		
	}

	@SuppressWarnings("unchecked")
	public List<SubjectHlo> findAllSubjects()
	{
		List<SubjectHlo> subjectHlos = null;
		
			try {
				logger.debug("subject  is about to be selected: "
						);
				subjectHlos  = new ArrayList<SubjectHlo>();
				subjectHlos = getSession().createQuery("from SubjectHlo ")
						.list();
				logger.debug("subject is selected");
			} catch (JDBCConnectionException e) {
				logger.error("JDBCConnectionException occured while selecting subjects : "
						+ subjectHlos.size()+ " : " + e);
				throw new FrozanGenericException(
						ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
			} catch (ConstraintViolationException e) {
				logger.error("ConstraintViolationException occured while saving subject : "
						+subjectHlos.size()+ " : " + e);
				throw new FrozanGenericException(
						ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
			} catch (HibernateException e) {
				logger.error("HibernateException occured while saving student : "
						+ subjectHlos.size()+ " : " + e);
				throw new FrozanGenericException(
						ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
			} catch (Exception e) {
				logger.error("Exception occured while saving student : "
						+ subjectHlos.size()+ " : " + e);
				throw new FrozanGenericException(e.getMessage());
			}
			
			return subjectHlos;
		
	
	}

}
