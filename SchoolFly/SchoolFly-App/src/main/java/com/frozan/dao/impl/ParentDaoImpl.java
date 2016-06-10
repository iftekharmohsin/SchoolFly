package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.ParentDao;
import com.frozan.hlo.ParentHlo;
@Repository("parentDao")
public class ParentDaoImpl extends AbstractDao implements ParentDao {
	
	// Registering to Logger
			private static final Logger logger = Logger.getLogger(ParentDaoImpl.class);

   @Override
	public boolean save(ParentHlo parentHlo)
	{
		persist(parentHlo);
		return true;
	}
   @Override
	public void modify(ParentHlo parentHlo)
	{
		update(parentHlo);
	}
   @Override
	public void delete(ParentHlo parentHlo)
	{
		delete(parentHlo);
	}
   @Override
	public List<ParentHlo> getParentById(int studentId)
	{
		List<ParentHlo> parentHlo=null;
		parentHlo=new ArrayList<ParentHlo>();
		parentHlo=getSession().createQuery("from ParentHlo p where p.id=id").list();
		//change with student idS
		return parentHlo;
	}
   @Override
	@SuppressWarnings("unchecked")
	public List<ParentHlo> getAllParents()
	{
		List<ParentHlo> parents=null;
		parents=new ArrayList<ParentHlo>();
		parents=getSession().createQuery("from ParentHlo").list();
		return parents;
		
	}
   @Override
	public ParentHlo findById(int id) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List  query = getSession().createQuery("from ParentHlo p where p.id=id").list();
		parentHlo = (ParentHlo) query.get(0);
		return parentHlo;
	}
   @Override
	public ParentHlo findByMail(String email) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List  query = getSession().createQuery("from ParentHlo p where p.email=email").list();
		parentHlo = (ParentHlo) query.get(0);
		return parentHlo;
	}



}
