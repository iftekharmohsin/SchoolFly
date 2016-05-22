package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.BusDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.BusHlo;

@Repository("busDao")
public class BusDaoImpl extends AbstractDao implements BusDao {
	
	    // Registering to Logger
		private static final Logger logger = Logger
				.getLogger(BusDaoImpl.class);
	@Override
	public void save(BusHlo busHlo) {
	try {	
		logger.debug("busHlo is about to be saved : "+busHlo.getId() );
		persist(busHlo);
		logger.debug("busHlo saved succussfully");
	} catch (JDBCConnectionException e) {
		logger.error("JDBCConnectionException occured while saving busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : " + e);
		throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
	} catch (ConstraintViolationException e) {
		logger.error("ConstraintViolationException occured while saving busHlo : "+busHlo.getId()+" "+ busHlo.getId()+" : "+ e);
		throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+busHlo.getId()+" "+e);
	} catch (HibernateException e) {
		logger.error("HibernateException occured while saving busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : "+ e);
		throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": busHlo Name:"+busHlo.getId()+" "+ e);
	} catch (Exception e){
		logger.error("Exception occured while saving busHlo : "+busHlo.getId()+" : "+ e);
		throw new TelentCloudDaoException(e.getMessage());
	}
	}
	@Override
	public void modify(BusHlo busHlo) {
		try {	
			logger.debug("busHlo is about to be updated : "+busHlo.getId() );
			update(busHlo);
			logger.debug("busHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating busHlo : "+busHlo.getId()+" "+ busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+busHlo.getId()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": busHlo Name:"+busHlo.getId()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while updating busHlo : "+busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		
	}
	@Override
	public void delete(BusHlo busHlo) {
		try {	
			logger.debug("busHlo is about to be deleted : "+busHlo.getId() );
			delete(busHlo);
			logger.debug("busHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting busHlo : "+busHlo.getId()+" "+ busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+busHlo.getId()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": busHlo Name:"+busHlo.getId()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while deleting busHlo : "+busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	
	@Override
	public BusHlo findBusByid(int id) {
		BusHlo busHlo = null;
		busHlo = new BusHlo();
		try {	
			logger.debug("busHlo is about to be found : "+busHlo.getId() );
			busHlo = (BusHlo) getSession().createQuery(
					"from BusHlo b where b.id=id").uniqueResult();
			logger.debug("busHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding busHlo : "+busHlo.getId()+" "+ busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while finding:"+busHlo.getId()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding busHlo : "+busHlo.getId()+" "+ busHlo.getId() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": busHlo Name:"+busHlo.getId()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while finding busHlo : "+busHlo.getId()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return busHlo;
		

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<BusHlo> findAllBuses() {
		List<BusHlo> busHlo = null;
		busHlo=new ArrayList<BusHlo>();
		try {
			logger.debug("classes is about to be selected : ");
			busHlo = getSession().createQuery("from BusHlo ").list();
			logger.debug("classes selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected classes: "
					+ busHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected classes: "
					+ busHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted class : "
					+ busHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected classes : "
					+ busHlo.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}		
			return busHlo;
	}
}
