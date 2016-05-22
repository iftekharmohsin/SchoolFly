package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.AdminDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.AdminHlo;
import com.frozan.hlo.ClassHlo;

@Repository("adminDao")
public class AdminDaoImpl extends AbstractDao implements AdminDao {

	// Registering to Logger
	private static final Logger logger = Logger.getLogger(AdminDaoImpl.class);

	/**
	 * Saves the AdminHlo Object to database
	 * @param AdminHlo
	 * @throws TelentCloudException - Exception related to database
	 */
	
	@Override
	public void save(AdminHlo adminHlo) {
		try {	
			logger.debug("AdminHlo is about to be saved : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() );
			persist(adminHlo);
			logger.debug("AdminHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving AdminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() + " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": AdminHlo Name:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (Exception e){
			logger.error("Exception occured while saving AdminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() + " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	
	}


	/**
	 * Modifies the AdminHlo 
	 * @param AdminHlo
	 * @throws TelentCloudException - Exception related to database
	 */
	
	@Override
	public void modify(AdminHlo adminHlo) {
		
		try {	
			logger.debug("AdminHlo is about to be modified : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName());
			update(adminHlo);
			logger.debug("AdminHlo modified succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while modifing adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while modifing adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while modifing adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": AdminHlo Name:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (Exception e){
			logger.error("HibernateException occured while modifing adminHlo : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+" : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		
	}
	
	/**
	 * Delete the AdminHlo
	 * @param AdminHlo
	 * @throws TelentCloudException - Exception related to database
	 */
	
	@Override
	public void delete(AdminHlo adminHlo) {
	  	try {
			logger.debug("AdminHlo is about to be deleted : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName());
			getSession().delete(adminHlo);
			logger.debug("AdminHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting AdminHlo : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": AdminHlo Name:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (Exception e){
			logger.error("Exception occured while deleting application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}

	}

	/**
	 * Find AdminHlo by id
	 * @param id
	 * @throws TelentCloudException - Exception related to database
	 */
	
	@Override
	public AdminHlo getAdminById(int id) {
		AdminHlo adminHlo = null;
		adminHlo = new AdminHlo();
		try {
			logger.debug("Finding AdminHlo is by ID : "+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName());
		
			adminHlo = (AdminHlo) getSession().createQuery(
				"from AdminHlo a where a.id=id").uniqueResult();
			logger.debug("AdminHlo Found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding AdminHlo : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": AdminHlo Name:"+adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName() +e);
		} catch (Exception e){
			logger.error("Exception occured while finding application : "+ adminHlo.getAdminFirstName()+" "+ adminHlo.getAdminLastName()+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return adminHlo;
	}

	/**
	 * Find All AdminHlo
	 * @throws  TelentCloudException - Exception related to database
	 */

	@SuppressWarnings("unchecked")
	public List<AdminHlo> getAllAdmin() {
		List<AdminHlo> adminHlo = null;
		adminHlo = new ArrayList<AdminHlo>();
		try {
			logger.debug("Admin is about to be selected : ");
			adminHlo = getSession().createQuery("from AdminHlo").list();
			logger.debug("Admin selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected Admin: "
					+ adminHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected Admin: "
					+ adminHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted Admin : "
					+ adminHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected Admin : "
					+ adminHlo.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		return adminHlo;
	}
}
