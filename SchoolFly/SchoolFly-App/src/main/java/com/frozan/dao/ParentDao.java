package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.ParentHlo;
@Repository("parentDao")
public class ParentDao extends TempletDao {
	
	public void save(ParentHlo parentHlo)
	{
		persist(parentHlo);
	}
	
	public void modify(ParentHlo parentHlo)
	{
		update(parentHlo);
	}
	
	public void delete(ParentHlo parentHlo)
	{
		delete(parentHlo);
	}
	
	public ParentHlo getParentById(int id)
	{
		ParentHlo parentHlo=null;
		parentHlo=new ParentHlo();
		parentHlo=(ParentHlo)getSession().createQuery("from ParentHlo p where p.id=id").uniqueResult();
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



}
