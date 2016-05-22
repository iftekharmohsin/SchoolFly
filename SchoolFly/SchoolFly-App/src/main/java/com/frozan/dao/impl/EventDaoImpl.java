package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.EventDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.EventHlo;

@Repository("eventDao")
public class EventDaoImpl extends AbstractDao  implements EventDao{
	
	// Registering to Logger
				private static final Logger logger = Logger.getLogger(EventDaoImpl.class);

	@Override
	public void save(EventHlo eventHlo) {
		try {	
			logger.debug("eventHlo is about to be saved : "+eventHlo.getId()+" " );
			persist(eventHlo);
			logger.debug("eventHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving eventHlo : "+eventHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+eventHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": eventHlo id:"+eventHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving eventHlo : "+eventHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}

	}
	@Override
	public void modify(EventHlo eventHlo) {
		try {	
			logger.debug("eventHlo is about to be modified : "+eventHlo.getId()+" " );
			update(eventHlo);
			logger.debug("eventHlo modified succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while modifing eventHlo : "+eventHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while modifing eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while modifing:"+eventHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while modifing eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": eventHlo id:"+eventHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while modifing eventHlo : "+eventHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(EventHlo eventHlo) {
		try {	
			logger.debug("eventHlo is about to be deleteed : "+eventHlo.getId()+" " );
			delete(eventHlo);
			logger.debug("eventHlo deleteed succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting eventHlo : "+eventHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleteing:"+eventHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": eventHlo id:"+eventHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleting eventHlo : "+eventHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public EventHlo getEventHloByid(int id) {
		EventHlo eventHlo = null;
		eventHlo = new EventHlo();
		try {	
			logger.debug("eventHlo is about to be found : "+eventHlo.getId()+" " );
			eventHlo = (EventHlo) getSession().createQuery(
					"from EventHlo e where e.id=id").uniqueResult();
			logger.debug("eventHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding eventHlo : "+eventHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while finding:"+eventHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding eventHlo : "+eventHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": eventHlo id:"+eventHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding eventHlo : "+eventHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return eventHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<EventHlo> getAllEvents() {
		List<EventHlo> eventHlo = null;
		eventHlo = new ArrayList<EventHlo>();
		try {
			logger.debug("Events is about to be selected : ");
			eventHlo = getSession().createQuery("from EventHlo ").list();
			logger.debug("Events selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected Events: "
					+ eventHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected Events: "
					+ eventHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted Events : "
					+ eventHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected Events : "
					+ eventHlo.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		return eventHlo;
	}

}
