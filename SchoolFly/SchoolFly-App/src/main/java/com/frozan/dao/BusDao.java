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
import com.frozan.hlo.BusHlo;
import com.frozan.hlo.StudentHlo;

@Repository("busDao")
public class BusDao extends TempletDao {
	public void save(BusHlo busHlo) {
		try {
			logger.debug("bus is about to be saved : "
					+busHlo.getBusNo() );
			persist(busHlo);
			logger.debug("student saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving student : "
					+ busHlo.getBusNo() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		

	}

	public void modify(BusHlo busHlo) {
		try {
			logger.debug("bus is about to be saved : "
					+busHlo.getBusNo() );
			update(busHlo);
			logger.debug("student saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving student : "
					+ busHlo.getBusNo() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}

	}

	public void delete(BusHlo busHlo) {
		try {
			logger.debug("bus is about to be saved : "
					+busHlo.getBusNo() );
			delete(busHlo);
			logger.debug("student saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving student : "
					+ busHlo.getBusNo() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ busHlo.getBusNo()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
		
	}

	public BusHlo findBusByid(int id) {
		BusHlo busHlo = null;
		try {
			logger.debug("student is about to be selected: ");
			busHlo = new BusHlo();
			busHlo = (BusHlo) getSession().createQuery(
					"from BusHlo b where b.id=id").uniqueResult();
			
			
			logger.debug("student selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selecting student : "
					+ e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selecting student :  "
					+ e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while selecting student : "
					+ " " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selecting student : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		return busHlo;
		

	}

	@SuppressWarnings("unchecked")
	public List<BusHlo> findAllBuses() {
		List<BusHlo> busHlo = null;
		try {
			logger.debug("bus is about to be selected: ");
			busHlo=new ArrayList<BusHlo>();
			busHlo = getSession().createQuery("from BusHlo ")
					.list();
			
			logger.debug("bus selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selecting bus : "
					+ e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selecting bus :  "
					+ e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while selecting bus : "
					+ " " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selecting bus : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		return busHlo;
		
		
		
	}
}
