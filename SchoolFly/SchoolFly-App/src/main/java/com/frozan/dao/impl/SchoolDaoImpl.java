package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.SchoolDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.exception.TelentCloudGenericException;
import com.frozan.hlo.SchoolHlo;

@Repository("SchoolDao")
public class SchoolDaoImpl extends AbstractDao implements SchoolDao {
	// Registering to Logger
	private static final Logger logger = Logger.getLogger(ParentDaoImpl.class);

	@Override
	public void save(SchoolHlo schoolHlo) 
	{
		try {	
			logger.debug("ExamTimeTableHlo is about to be saved : "+schoolHlo.getId()+" " );
			persist(schoolHlo);
			logger.debug("ExamTimeTableHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving ExamTimeTableHlo : "+schoolHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving ExamTimeTableHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+schoolHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving ExamTimeTableHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+schoolHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving ExamTimeTableHlo : "+schoolHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	} 
	@Override
	public void modify(SchoolHlo schoolHlo) {
		try {	
			logger.debug("schoolHlo is about to be updated : "+schoolHlo.getId()+" " );
			update(schoolHlo);
			logger.debug("schoolHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updateding schoolHlo : "+schoolHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updateding schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while updateding:"+schoolHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updateding schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": schoolHlo id:"+schoolHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while updateding schoolHlo : "+schoolHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(SchoolHlo schoolHlo) {
		try {	
			logger.debug("schoolHlo is about to be deleted : "+schoolHlo.getId()+" " );
			delete(schoolHlo);
			logger.debug("schoolHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting schoolHlo : "+schoolHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+schoolHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+schoolHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleting schoolHlo : "+schoolHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public SchoolHlo findRouteByid(int id) {
		SchoolHlo schoolHlo = null;
		schoolHlo = new SchoolHlo();
		try {	
			logger.debug("schoolHlo is about to be found : "+schoolHlo.getId()+" " );
			schoolHlo = (SchoolHlo) getSession().createQuery(
					"from SchoolHlo r where r.id=id").uniqueResult();
			logger.debug("schoolHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding schoolHlo : "+schoolHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while finding:"+schoolHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding schoolHlo : "+schoolHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": schoolHlo id:"+schoolHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding schoolHlo : "+schoolHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return schoolHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<SchoolHlo> findAllSchool() {
		List<SchoolHlo> routeHlo = null;
		routeHlo = new ArrayList<SchoolHlo>();
		routeHlo = getSession().createQuery("from RouteHlo ")
				.list();
		return routeHlo;
	}

		}
