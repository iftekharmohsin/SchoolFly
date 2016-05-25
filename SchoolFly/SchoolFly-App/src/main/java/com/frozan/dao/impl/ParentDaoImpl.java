package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.ParentDao;
import com.frozan.exception.DaoExceptionMsg;
import com.frozan.exception.TelentCloudDaoException;
import com.frozan.hlo.ParentHlo;
@Repository("parentDao")
public class ParentDaoImpl extends AbstractDao implements ParentDao {
	
	// Registering to Logger
			private static final Logger logger = Logger.getLogger(ParentDaoImpl.class);

   @Override
	public boolean save(ParentHlo parentHlo)
	{
		try {	
			logger.debug("ParentHlo is about to be saved : "+parentHlo.getFirstName()+" " );
			persist(parentHlo);
			logger.debug("ParentHlo saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving ParentHlo : "+parentHlo.getFirstName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while saving:"+parentHlo.getFirstName()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.getFirstName()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while saving ParentHlo : "+parentHlo.getFirstName()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return true;
	}
   @Override
	public void modify(ParentHlo parentHlo)
	{
		try {	
			logger.debug("ParentHlo is about to be updating : "+parentHlo.getFirstName()+" " );
			update(parentHlo);
			logger.debug("ParentHlo updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating ParentHlo : "+parentHlo.getFirstName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while updating:"+parentHlo.getFirstName()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.getFirstName()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while updating ParentHlo : "+parentHlo.getFirstName()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
   @Override
	public void delete(ParentHlo parentHlo)
	{
	   
		try {	
			logger.debug("ParentHlo is about to be deleting : "+parentHlo.getFirstName()+" " );
			delete(parentHlo);
			logger.debug("ParentHlo deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting ParentHlo : "+parentHlo.getFirstName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+parentHlo.getFirstName()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.getFirstName()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while deleteing ParentHlo : "+parentHlo.getFirstName()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
	}
   @Override
	public List<ParentHlo> getParentById(int studentId)
	{
		List<ParentHlo> parentHlo=null;
		parentHlo=new ArrayList<ParentHlo>();
		try {	
			logger.debug("ParentHlo is about to be finding : "+parentHlo.size()+" " );
			parentHlo=getSession().createQuery("from ParentHlo p where p.id=id").list();
			//change with student idS
			logger.debug("ParentHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding ParentHlo : "+parentHlo.size()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding ParentHlo : "+parentHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+parentHlo.size()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding ParentHlo : "+parentHlo.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.size()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding ParentHlo : "+parentHlo.size()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return parentHlo;
	}
   @Override
	@SuppressWarnings("unchecked")
	public List<ParentHlo> getAllParents()
	{
		List<ParentHlo> parents=null;
		parents=new ArrayList<ParentHlo>();
		try {	
			logger.debug("ParentHlo is about to be finding : "+parents.size()+" " );
			parents=getSession().createQuery("from ParentHlo").list();
			//change with student idS
			logger.debug("ParentHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding ParentHlo : "+parents.size()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding ParentHlo : "+parents.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+parents.size()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding ParentHlo : "+parents.size()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parents.size()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding ParentHlo : "+parents.size()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return parents;
		
	}
   @Override
	public ParentHlo findById(int id) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List<ParentHlo>  query = getSession().createQuery("from ParentHlo p where p.id=id").list();
		try {	
			logger.debug("ParentHlo is about to be finding : "+parentHlo.getFirstName()+" " );
			parentHlo = (ParentHlo) query.get(0);
			//change with student idS
			logger.debug("ParentHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding ParentHlo : "+parentHlo.getFirstName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+parentHlo.getFirstName()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.getFirstName()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return parentHlo;
	}
   @Override
	public ParentHlo findByMail(String email) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List<ParentHlo>  query = getSession().createQuery("from ParentHlo p where p.email=email").list();
		try {	
			logger.debug("ParentHlo is about to be finding : "+parentHlo.getFirstName()+" " );
			parentHlo = (ParentHlo) query.get(0);
			//change with student idS
			logger.debug("ParentHlo found succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while finding ParentHlo : "+parentHlo.getFirstName()+" " + " : " + e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONNECTION_FAILED.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.CONSTRAINT_ERROR.getMessage()+" while deleting:"+parentHlo.getFirstName()+" "+ e);
		} catch (HibernateException e) {
			logger.error("HibernateException occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+" : "+ e);
			throw new TelentCloudDaoException(DaoExceptionMsg.UPDATE_FAILED.getMessage()+ ": ParentHlo id:"+parentHlo.getFirstName()+" " +e);
		} catch (Exception e){
			logger.error("Exception occured while finding ParentHlo : "+parentHlo.getFirstName()+" "+ " : "+ e);
			throw new TelentCloudDaoException(e.getMessage());
		}
		return parentHlo;
	}

}
