package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.frozan.hlo.ParentHlo;
@Repository("parentDao")
public class ParentDao extends TempletDao {
	
	public boolean save(ParentHlo parentHlo)
	{
		persist(parentHlo);
		return true;
	}
	
	public void modify(ParentHlo parentHlo)
	{
		update(parentHlo);
	}
	
	public void delete(ParentHlo parentHlo)
	{
		delete(parentHlo);
	}
	
	public List<ParentHlo> getParentById(int studentId)
	{
		List<ParentHlo> parentHlo=null;
		parentHlo=new ArrayList<ParentHlo>();
		parentHlo=getSession().createQuery("from ParentHlo p where p.id=id").list();//change with student idS
		return parentHlo;
	}
	
	@SuppressWarnings("unchecked")
	public List<ParentHlo> getAllParents()
	{
		List<ParentHlo> parents=null;
		parents=new ArrayList<ParentHlo>();
		parents=getSession().createQuery("from ParentHlo").list();
		return parents;
		
	}

	public ParentHlo findById(int id) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List  query = getSession().createQuery("from ParentHlo p where p.id=id").list();
		parentHlo = (ParentHlo) query.get(0);
		return parentHlo;
	}

	public ParentHlo findByMail(String email) {
		ParentHlo parentHlo=new ParentHlo();
		//parentHlo=(ParentHlo) getSession().createQuery("from ParentHlo p where p.id=id");//change with student idS
		List  query = getSession().createQuery("from ParentHlo p where p.email=email").list();
		parentHlo = (ParentHlo) query.get(0);
		return parentHlo;
	}



}
