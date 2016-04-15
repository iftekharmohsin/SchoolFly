package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.AllergiesHlo;

@Repository("allergiesDao")
public class AllergiesDao  extends TempletDao{
	
	public void save(AllergiesHlo allergiesHlo) {
		persist(allergiesHlo);

	}
	public void modify(AllergiesHlo allergiesHlo) {
		update(allergiesHlo);
	}

	public void delete(AllergiesHlo allergiesHlo) {
		delete(allergiesHlo);
	}
	public AllergiesHlo findAllergiesById(int id)
	{
		AllergiesHlo allergiesHlo=null;
		allergiesHlo = new AllergiesHlo();
		allergiesHlo = (AllergiesHlo) getSession().createQuery(
				"from AllergiesHlo al where al.id=id").uniqueResult();
		return allergiesHlo;
		
	}

	@SuppressWarnings("unchecked")
	public List<AllergiesHlo> findAllAllergies()
	{
		List<AllergiesHlo> allergiesHlo = null;
		allergiesHlo = new ArrayList<AllergiesHlo>();
		allergiesHlo = getSession().createQuery("from AllergiesHlo ")
				.list();
		return allergiesHlo;
	}

}
