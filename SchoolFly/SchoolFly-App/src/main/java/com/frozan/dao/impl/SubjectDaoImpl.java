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
import com.frozan.dao.interfaces.SubjectDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.SubjectHlo;

@Repository("subjectDao")
public class SubjectDaoImpl  extends AbstractDao implements SubjectDao{
	
	// Registering to Logger
	private static final Logger logger = Logger.getLogger(SubjectDaoImpl.class);

	@Override
	public void save(SubjectHlo subjectHlo)
	{  
		try {	
			logger.debug("subjectHlo is about to be saved : "+subjectHlo.getId()+" " );
			persist(subjectHlo);
			logger.debug("subjectHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving subjectHlo : "+subjectHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subjectHlo : "+subjectHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+subjectHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving subjectHlo : "+subjectHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": subjectHlo id:"+subjectHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving subjectHlo : "+subjectHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
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
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		
	}
	@Override
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
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		
	}
	@Override
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
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving subject : "
					+subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ subjectHlo.getName()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		
		return subjectHlo;
		
	}

	@SuppressWarnings("unchecked")
	@Override
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
				throw new TelentCloudGenericException(
						DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
			} catch (ConstraintViolationException e) {
				logger.error("ConstraintViolationException occured while saving subject : "
						+subjectHlos.size()+ " : " + e);
				throw new TelentCloudGenericException(
						DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
			} catch (HibernateException e) {
				logger.error("HibernateException occured while saving student : "
						+ subjectHlos.size()+ " : " + e);
				throw new TelentCloudGenericException(
						DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
			} catch (Exception e) {
				logger.error("Exception occured while saving student : "
						+ subjectHlos.size()+ " : " + e);
				throw new TelentCloudGenericException(e.getMessage());
			}
			
			return subjectHlos;
		
	
	}

}
