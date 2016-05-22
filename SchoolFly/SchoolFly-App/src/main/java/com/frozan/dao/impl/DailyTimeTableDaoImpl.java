package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.DailyTimeTableDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.ClassHlo;
import com.frozan.hlo.DailyTimeTableHlo;

@Repository("dailyTimeTableDao")
public class DailyTimeTableDaoImpl extends AbstractDao implements DailyTimeTableDao {

	// Registering to Logger
		private static final Logger logger = Logger.getLogger(DailyTimeTableDaoImpl.class);

	@Override
	public void save(DailyTimeTableHlo dailyTimeTableHlo) {
		
		try {
			logger.debug("dailytimetable is about to be saved : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			persist(dailyTimeTableHlo);
			logger.debug("dailytimetable saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		

	}
	@Override
	public void modify(DailyTimeTableHlo dailyTimeTableHlo) {
		try {
			logger.debug("dailytimetable is about to be updated : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			update(dailyTimeTableHlo);
			logger.debug("dailytimetable updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while updating class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}

		
	}
	@Override
	public void delete(DailyTimeTableHlo dailyTimeTableHlo) {
		try {
			logger.debug("dailytimetable is about to be deleted : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			delete(dailyTimeTableHlo);
			logger.debug("dailytimetable deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while deleting class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
	
	}
	@Override
	public DailyTimeTableHlo getTimeTableByid(int id) {
		DailyTimeTableHlo dailyTimeTableHlo = null;
		dailyTimeTableHlo = new DailyTimeTableHlo();
		try {
			logger.debug("dailytimetable is about to be found : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			dailyTimeTableHlo = (DailyTimeTableHlo) getSession().createQuery(
					"from DailyTimeTableHlo d where d.id=id").uniqueResult();
			logger.debug("dailytimetable found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while finding class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		return dailyTimeTableHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<DailyTimeTableHlo> getTimeTable() {
		List<DailyTimeTableHlo> dailyTimeTableHlo = null;
		dailyTimeTableHlo = new ArrayList<DailyTimeTableHlo>();
		try {
			logger.debug("classes is about to be selected : ");
			dailyTimeTableHlo = getSession().createQuery("from DailyTimeTableHlo ").list();
			logger.debug("classes selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected classes: "
					+ dailyTimeTableHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected classes: "
					+ dailyTimeTableHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted class : "
					+ dailyTimeTableHlo.size() + " : " + e);
			throw new TelentCloudGenericException(
					DaoExceptionMsg.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected classes : "
					+ dailyTimeTableHlo.size() + " : " + e);
			throw new TelentCloudGenericException(e.getMessage());
		}
		return dailyTimeTableHlo;
	}
}
