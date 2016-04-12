package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.frozan.entity.DailyTimeTable;
import com.frozan.exception.ExceptionMessage;
import com.frozan.exception.FrozanGenericException;
import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.hlo.ExamTimeTableHlo;

@Repository("dailyTimeTableDao")
public class DailyTimeTableDao extends TempletDao {

	public void save(DailyTimeTableHlo dailyTimeTableHlo) {
		
		try {
			logger.debug("dailytimetable is about to be saved : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			persist(dailyTimeTableHlo);
			logger.debug("dailytimetable saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		

	}

	public void modify(DailyTimeTableHlo dailyTimeTableHlo) {
		try {
			logger.debug("dailytimetable is about to be updated : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			update(dailyTimeTableHlo);
			logger.debug("dailytimetable updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while updating class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}

		
	}

	public void delete(DailyTimeTableHlo dailyTimeTableHlo) {
		try {
			logger.debug("dailytimetable is about to be deleted : "
				+dailyTimeTableHlo.getDailyTimeTableId()	 );
			delete(dailyTimeTableHlo);
			logger.debug("dailytimetable deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while  dailytimetable: "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving dailytimetable: "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving dailytimetable : "
					+dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving class : "
					+ dailyTimeTableHlo.getDailyTimeTableId()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
	
	}

	public DailyTimeTableHlo getTimeTableByid(int id) {
		DailyTimeTableHlo dailyTimeTableHlo = null;
		dailyTimeTableHlo = new DailyTimeTableHlo();
		dailyTimeTableHlo = (DailyTimeTableHlo) getSession().createQuery(
				"from DailyTimeTableHlo d where d.id=id").uniqueResult();
		return dailyTimeTableHlo;

	}

	@SuppressWarnings("unchecked")
	public List<DailyTimeTableHlo> getTimeTable() {
		List<DailyTimeTableHlo> dailyTimeTableHlo = null;
		dailyTimeTableHlo = new ArrayList<DailyTimeTableHlo>();
		dailyTimeTableHlo = getSession().createQuery("from DailyTimeTableHlo ")
				.list();
		return dailyTimeTableHlo;
	}
}
