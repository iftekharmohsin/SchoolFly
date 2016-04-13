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
import com.frozan.hlo.StudentHlo;

@Repository("studentDao")
public class StudentDao extends TempletDao {

	public void save(StudentHlo studentHlo) {
		persist(studentHlo);
		/*try {
			logger.debug("student is about to be saved : "
					+ studentHlo.getStdFirstName());
		
			logger.debug("student saved succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}*/

	}

	public void modify(StudentHlo studentHlo) {
		update(studentHlo);
/*		try {
			logger.debug("student is about to be update : "
					+ studentHlo.getStdFirstName());
			
			logger.debug("student updated succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while update student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}*/

	}

	public void delete(StudentHlo studentHlo) {
		delete(studentHlo);
		/*try {
			logger.debug("student is about to be deleted : "
					+ studentHlo.getStdFirstName());
			
			logger.debug("student deleted succussfully");
		} catch (JDBCConnectionException e) {
			logger.error("JDBCConnectionException occured while deleted student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (ConstraintViolationException e) {
			logger.error("ConstraintViolationException occured while saving student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (HibernateException e) {
			logger.error("HibernateException occured while deleting student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(
					ExceptionMessage.CONSTVAIlATION_MSG.getMessage());
		} catch (Exception e) {
			logger.error("Exception occured while deleting student : "
					+ studentHlo.getStdFirstName() + " : " + e);
			throw new FrozanGenericException(e.getMessage());
		}*/

	}

	@SuppressWarnings("unchecked")
	public List<StudentHlo> getAllStudent() {
		List<StudentHlo> students = null;
		Query query = getSession().createQuery("From StudentHlo");
		students = new ArrayList<StudentHlo>();
		students = query.list();
		/*try {
			logger.debug("student is about to be selected: ");
			
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
		}*/
		return students;
	}

	public StudentHlo getStudentById(int id) {
		StudentHlo student = null;
		Query query = getSession().createQuery("From StudentHlo s where s.id=:id");
		query.setParameter("id",id);
		student = (StudentHlo) query.uniqueResult();
		/*try {
			logger.debug("student is about to be selected: ");
			
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
		
		 * Query
		 * query=getSession().createQuery("From StudentHlo s where s:id=id");
		 * StudentHlo student=(StudentHlo) query.uniqueResult();
		 */
		return student;
	}
}
