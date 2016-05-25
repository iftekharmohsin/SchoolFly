package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.SectionDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.SectionHlo;

@Repository("sectionDao")
public class SectionDaoImpl extends AbstractDao implements SectionDao {

	
	// Registering to Logger
	private static final Logger logger = Logger.getLogger(SectionDaoImpl.class);

	@Override
	public void save(SectionHlo sectionHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+sectionHlo.getId()+" " );
			persist(sectionHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+sectionHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+sectionHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+sectionHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+sectionHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void modify(SectionHlo sectionHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+sectionHlo.getId()+" " );
			update(sectionHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+sectionHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+sectionHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+sectionHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+sectionHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(SectionHlo sectionHlo) {
		try {	
			logger.debug("sectionHlo is about to be saved : "+sectionHlo.getId()+" " );
			delete(sectionHlo);
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+sectionHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+sectionHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+sectionHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+sectionHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public SectionHlo getSectionById(int id)

	{
		SectionHlo sectionHlo = null;
		sectionHlo = new SectionHlo();
		try {	
			logger.debug("sectionHlo is about to be saved : "+sectionHlo.getId()+" " );
			sectionHlo = (SectionHlo) getSession().createQuery(
					"from BusHlo b where b.id=id").uniqueResult();
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+sectionHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+sectionHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+sectionHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+sectionHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+sectionHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return sectionHlo;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<SectionHlo> getAllSections() {
		List<SectionHlo> sectionHlo = null;
		sectionHlo = new ArrayList<SectionHlo>();
		try {	
			logger.debug("sectionHlo is about to be saved : "+sectionHlo.size()+" " );
			sectionHlo = getSession().createQuery("from SectionHlo ").list();
			logger.debug("sectionHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving sectionHlo : "+sectionHlo.size()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving sectionHlo : "+sectionHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+sectionHlo.size()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving sectionHlo : "+sectionHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": sectionHlo id:"+sectionHlo.size()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving sectionHlo : "+sectionHlo.size()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return sectionHlo;
	}

}
