package com.frozan.dao.interfaces;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public abstract class AbstractDao {
Logger logger=Logger.getLogger(AbstractDao.class);
	
					@Autowired
					private SessionFactory sessionFactory;
				
					protected Session getSession() {
						System.out.println("****** Session "+sessionFactory.getCurrentSession());
						logger.info("inside session"+sessionFactory.getCurrentSession());
						return sessionFactory.getCurrentSession();
					}
				
					public void persist(Object entity){
						System.out.println("*************************"+getSession());
						logger.info("start in persist");
						getSession().save(entity);
					
					}
					
					public void delete(Object entity){
						getSession().delete(entity);
					}
				
					public void update(Object entity){
						getSession().saveOrUpdate(entity);
					}

}
