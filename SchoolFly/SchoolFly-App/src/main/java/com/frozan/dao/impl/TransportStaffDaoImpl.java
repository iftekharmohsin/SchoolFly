package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.TransportStaffDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.TransportStaffHlo;

@Repository("transportStaffDao")
public class TransportStaffDaoImpl extends AbstractDao implements TransportStaffDao{
	
	// Registering to Logger
			private static final Logger logger = Logger.getLogger(StudentDaoImpl.class);

	public void save(TransportStaffHlo transportStaffHlo) {
		try {	
			logger.debug("transportStaffHlo is about to be saved : "+transportStaffHlo.getId()+" " );
			persist(transportStaffHlo);
			logger.debug("transportStaffHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+transportStaffHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": transportStaffHlo id:"+transportStaffHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}

	public void modify(TransportStaffHlo transportStaffHlo) {

		try {	
			logger.debug("transportStaffHlo is about to be saved : "+transportStaffHlo.getId()+" " );
			update(transportStaffHlo);
			logger.debug("transportStaffHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+transportStaffHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": transportStaffHlo id:"+transportStaffHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}

	public void delete(TransportStaffHlo transportStaffHlo) {
		try {	
			logger.debug("transportStaffHlo is about to be saved : "+transportStaffHlo.getId()+" " );
			delete(transportStaffHlo);
			logger.debug("transportStaffHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+transportStaffHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": transportStaffHlo id:"+transportStaffHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}

	public TransportStaffHlo findTransportStaffById(int id) {
		TransportStaffHlo transportStaffHlo = null;
		transportStaffHlo = new TransportStaffHlo();
		try {	
			logger.debug("transportStaffHlo is about to be saved : "+transportStaffHlo.getId()+" " );
			transportStaffHlo = (TransportStaffHlo) getSession().createQuery(
					"from TransportStaffHlo ts where ts.id=id").uniqueResult();
			logger.debug("transportStaffHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+transportStaffHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+transportStaffHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": transportStaffHlo id:"+transportStaffHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving transportStaffHlo : "+transportStaffHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return transportStaffHlo;

	}

	@SuppressWarnings("unchecked")
	public List<TransportStaffHlo> findAllTransportStaff() {
		List<TransportStaffHlo> transportStaffHlo = null;
		transportStaffHlo = new ArrayList<TransportStaffHlo>();
		try {	
			logger.debug("transportStaffHlo is about to be saved : "+transportStaffHlo.size()+" " );
			transportStaffHlo = getSession().createQuery("from TransportStaffHlo ")
					.list();
			logger.debug("transportStaffHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving transportStaffHlo : "+transportStaffHlo.size()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving transportStaffHlo : "+transportStaffHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+transportStaffHlo.size()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+transportStaffHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": transportStaffHlo id:"+transportStaffHlo.size()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving transportStaffHlo : "+transportStaffHlo.size()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return transportStaffHlo;
	}
}
