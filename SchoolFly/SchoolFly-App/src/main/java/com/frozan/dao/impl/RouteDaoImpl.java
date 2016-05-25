package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.RouteDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.RouteHlo;

@Repository("routeDao")

public class RouteDaoImpl  extends AbstractDao implements RouteDao{
	
	// Registering to Logger
				private static final Logger logger = Logger.getLogger(ParentDaoImpl.class);
	@Override
	public void save(RouteHlo routeHlo)
	{
		try {	
			logger.debug("ExamTimeTableHlo is about to be saved : "+routeHlo.getId()+" " );
			persist(routeHlo);
			logger.debug("ExamTimeTableHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving ExamTimeTableHlo : "+routeHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+routeHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+routeHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving ExamTimeTableHlo : "+routeHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	} 
	@Override
	public void modify(RouteHlo routeHlo) {
		try {	
			logger.debug("ExamTimeTableHlo is about to be updated : "+routeHlo.getId()+" " );
			update(routeHlo);
			logger.debug("ExamTimeTableHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updateding ExamTimeTableHlo : "+routeHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updateding ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while updateding:"+routeHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updateding ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+routeHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while updateding ExamTimeTableHlo : "+routeHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public void delete(RouteHlo routeHlo) {
		try {	
			logger.debug("ExamTimeTableHlo is about to be deleted : "+routeHlo.getId()+" " );
			delete(routeHlo);
			logger.debug("ExamTimeTableHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting ExamTimeTableHlo : "+routeHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+routeHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+routeHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleting ExamTimeTableHlo : "+routeHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
	@Override
	public RouteHlo findRouteByid(int id) {
		RouteHlo routeHlo = null;
		routeHlo = new RouteHlo();
		try {	
			logger.debug("ExamTimeTableHlo is about to be found : "+routeHlo.getId()+" " );
			routeHlo = (RouteHlo) getSession().createQuery(
					"from RouteHlo r where r.id=id").uniqueResult();
			logger.debug("ExamTimeTableHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding ExamTimeTableHlo : "+routeHlo.getId()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while finding:"+routeHlo.getId()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding ExamTimeTableHlo : "+routeHlo.getId()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ExamTimeTableHlo id:"+routeHlo.getId()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding ExamTimeTableHlo : "+routeHlo.getId()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return routeHlo;

	}
	@Override
	@SuppressWarnings("unchecked")
	public List<RouteHlo> findAllRoute() {
		List<RouteHlo> routeHlo = null;
		routeHlo = new ArrayList<RouteHlo>();
		routeHlo = getSession().createQuery("from RouteHlo ")
				.list();
		return routeHlo;
	}
	

}
