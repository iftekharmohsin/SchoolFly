package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.ExamTimeTableDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.ExamTimeTableHlo;

@Repository("examTimeTableDao")

public class ExamTimeTableDaoImpl extends AbstractDao implements ExamTimeTableDao {
	
	// Registering to Logger
		private static final Logger logger = Logger.getLogger(ExamTimeTableDaoImpl.class);

	@Override
	public void save(ExamTimeTableHlo timeTableHlo)
	{
		try {	
			logger.debug("ExamTimeTableHlo is about to be saved : "+timeTableHlo.getExamTimeTableId()+" " );
			persist(timeTableHlo);
			logger.debug("ExamTimeTableHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+timeTableHlo.getExamTimeTableId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+timeTableHlo.getExamTimeTableId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void modify(ExamTimeTableHlo timeTableHlo)
	{
		try {	
			logger.debug("ExamTimeTableHlo is about to be updated : "+timeTableHlo.getExamTimeTableId()+" " );
			update(timeTableHlo);
			logger.debug("ExamTimeTableHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while updating:"+timeTableHlo.getExamTimeTableId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+timeTableHlo.getExamTimeTableId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while updating ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(ExamTimeTableHlo timeTableHlo)
	{
		try {	
			logger.debug("ExamTimeTableHlo is about to be deleted : "+timeTableHlo.getExamTimeTableId()+" " );
			delete(timeTableHlo);
			logger.debug("ExamTimeTableHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+timeTableHlo.getExamTimeTableId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+timeTableHlo.getExamTimeTableId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleting ExamTimeTableHlo : "+timeTableHlo.getExamTimeTableId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		
	}
	@Override
	public List<ExamTimeTableHlo> getTimeTableByid(int sectionId)
	{
		List<ExamTimeTableHlo> timeTableHlo=null;
		timeTableHlo=new ArrayList<ExamTimeTableHlo>();
		timeTableHlo=getSession().createQuery("from ExamTimeTableHlo e where e.id=id").list();//change with section id
		return timeTableHlo;	
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<ExamTimeTableHlo> getTimeTable()
	{
		List<ExamTimeTableHlo> tableHlos=null;
		tableHlos=new ArrayList<ExamTimeTableHlo>();
		tableHlos=getSession().createQuery("from ExamTimeTableHlo").list();
		return tableHlos;
	}


}
