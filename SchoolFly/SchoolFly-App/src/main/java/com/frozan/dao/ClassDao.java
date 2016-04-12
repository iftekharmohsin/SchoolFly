package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.stereotype.Repository;

import com.frozan.exception.ExceptionMessage;
import com.frozan.exception.FrozanGenericException;
import com.frozan.hlo.ClassHlo;

@Repository("classDao")
public class ClassDao extends TempletDao {
	public void save(ClassHlo classHlo) {
		try {
			logger.debug("class is about to be saved : "
				+classHlo.getClassName()	 );
			persist(classHlo);
			logger.debug("class saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving class: "
					+ classHlo.getClassName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving class: "
					+classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
	}

	public void modify(ClassHlo classHlo) {
		try {
			logger.debug("class is about to be updated : "
				+classHlo.getClassName()	 );
			update(classHlo);
			logger.debug("class saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while updating class: "
					+ classHlo.getClassName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while updating class: "
					+classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while updating class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while updating class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
	}

	public void delete(ClassHlo classHlo) {
		try {
			logger.debug("class is about to be deleted : "
				+classHlo.getClassName()	 );

			delete(classHlo);
			logger.debug("class deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleting class: "
					+ classHlo.getClassName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while deleting class: "
					+classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while deleting class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
	}

	public ClassHlo getClassByid(int id) {
		ClassHlo classHlo = null;
		try {
			logger.debug("class is about to be selected : ");

			classHlo = new ClassHlo();
			classHlo = (ClassHlo) getSession().createQuery(
					"from ClassHlo c where c.id=id").uniqueResult();	
			logger.debug("class selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected class: "
					+ classHlo.getClassName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected class: "
					+classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected class : "
					+ classHlo.getClassName()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
		
		return classHlo;

	}

	@SuppressWarnings("unchecked")
	public List<ClassHlo> getAllClasses() {
		List<ClassHlo> classHlo = null;
		try {
			logger.debug("classes is about to be selected : ");
			classHlo = new ArrayList<ClassHlo>();
			classHlo = getSession().createQuery("from ClassHlo ").list();	
			logger.debug("classes selected succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while selected classes: "
					+ classHlo.size() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while selected classes: "
					+classHlo.size()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while seleted class : "
					+ classHlo.size()+ " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while selected classes : "
					+ classHlo.size()+ " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}
	

		return classHlo;
	}
}
