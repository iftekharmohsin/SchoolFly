package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.AllergiesDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.ClassHlo;

@Repository("allergiesDao")
public class AllergiesDaoImpl extends AbstractDao implements AllergiesDao {

	// Registering to Logger
	private static final Logger logger = Logger
			.getLogger(AllergiesDaoImpl.class);

	@Override
	public void save(AllergiesHlo allergiesHlo) {
		try {	
			logger.debug("allergiesHlo is about to be saved : "+allergiesHlo.getName() );
			persist(allergiesHlo);
			logger.debug("allergiesHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() +" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+allergiesHlo.getName()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": allergiesHlo Name:"+allergiesHlo.getName()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while saving allergiesHlo : "+allergiesHlo.getName()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}

	}

	@Override
	public void modify(AllergiesHlo allergiesHlo) {
		try {	
			logger.debug("allergiesHlo is about to be updated : "+allergiesHlo.getName() );
			update(allergiesHlo);
			logger.debug("allergiesHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() +" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+allergiesHlo.getName()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": allergiesHlo Name:"+allergiesHlo.getName()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while updating allergiesHlo : "+allergiesHlo.getName()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}

	@Override
	public void delete(AllergiesHlo allergiesHlo) {
		try {	
			logger.debug("allergiesHlo is about to be deleted : "+allergiesHlo.getName() );
			delete(allergiesHlo);
			logger.debug("allergiesHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() +" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+allergiesHlo.getName()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": allergiesHlo Name:"+allergiesHlo.getName()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while deleting allergiesHlo : "+allergiesHlo.getName()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}

	@Override
	public AllergiesHlo findAllergiesById(int id) {
		AllergiesHlo allergiesHlo = null;
		allergiesHlo = new AllergiesHlo();
		try {	
			logger.debug("finding allergiesHlo  id : "+allergiesHlo.getName() );
		allergiesHlo = (AllergiesHlo) getSession().createQuery(
				"from AllergiesHlo al where al.id=id").uniqueResult();

			logger.debug("allergiesHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while found allergiesHlo : "+allergiesHlo.getName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding allergiesHlo by id : "+allergiesHlo.getName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+allergiesHlo.getName()+" "+e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding allergiesHlo : "+allergiesHlo.getName()+" "+ allergiesHlo.getName() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": allergiesHlo Name:"+allergiesHlo.getName()+" "+ e);
		} catch (Exception e){
			logger.error("Exception occured while finding allergiesHlo : "+allergiesHlo.getName()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return allergiesHlo;

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AllergiesHlo> findAllAllergies() {
		List<AllergiesHlo> allergiesHlo = null;
		allergiesHlo = new ArrayList<AllergiesHlo>();
		try {
			logger.debug("classes is about to be selected : ");
			allergiesHlo = getSession().createQuery("from AllergiesHlo ").list();
			logger.debug("classes selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected classes: "
					+ allergiesHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected classes: "
					+ allergiesHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted class : "
					+ allergiesHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected classes : "
					+ allergiesHlo.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		return allergiesHlo;
	}

}
