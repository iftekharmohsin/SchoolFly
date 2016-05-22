package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.DestinationDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.DestinationHlo;

@Repository("destinationDao")
public class DestinationDaoImpl extends AbstractDao implements DestinationDao {
	
	// Registering to Logger
			private static final Logger logger = Logger.getLogger(DestinationDaoImpl.class);

	@Override
	public void save(DestinationHlo destinationHlo)
	{
		try {	
			logger.debug("destinationHlo is about to be saved : "+destinationHlo.getId()+" " );
			persist(destinationHlo);
			logger.debug("destinationHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving destinationHlo : "+destinationHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+destinationHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": destinationHlo Name:"+destinationHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving destinationHlo : "+destinationHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void modify(DestinationHlo destinationHlo)
	{
		try {	
			logger.debug("destinationHlo is about to be updated : "+destinationHlo.getId()+" " );
			update(destinationHlo);
			logger.debug("destinationHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating destinationHlo : "+destinationHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while updating:"+destinationHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": destinationHlo id:"+destinationHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while updating destinationHlo : "+destinationHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(DestinationHlo destinationHlo)
	{
		try {	
			logger.debug("destinationHlo is about to be deleted : "+destinationHlo.getId()+" " );
			delete(destinationHlo);
			logger.debug("destinationHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting destinationHlo : "+destinationHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleteing:"+destinationHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": destinationHlo id:"+destinationHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleteing destinationHlo : "+destinationHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public DestinationHlo findDestinationById(int studentId)
	{
		DestinationHlo destinationHlo = null;
		destinationHlo = new DestinationHlo();
		try {	
			logger.debug("destinationHlo is about to be found : "+destinationHlo.getId()+" " );
			destinationHlo = (DestinationHlo) getSession().createQuery(
					"from DestinationHlo d where d.id=id").uniqueResult();//change with student id
			logger.debug("destinationHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding destinationHlo : "+destinationHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while finding:"+destinationHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding destinationHlo : "+destinationHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": destinationHlo id:"+destinationHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding destinationHlo : "+destinationHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return destinationHlo;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<DestinationHlo> findAllDestinations()
	{
		List<DestinationHlo> destinationHlos = null;
		destinationHlos = new ArrayList<DestinationHlo>();
		try {
			logger.debug("Destinations is about to be selected : ");
			destinationHlos = getSession().createQuery("from DestinationHlo ").list();
			logger.debug("Destinations selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected Destinations: "
					+ destinationHlos.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected Destinations: "
					+ destinationHlos.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted Destinations : "
					+ destinationHlos.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected Destinations : "
					+ destinationHlos.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}

		return destinationHlos;
	}

}
