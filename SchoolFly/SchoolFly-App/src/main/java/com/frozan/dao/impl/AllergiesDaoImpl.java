package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.AllergiesDao;
import com.frozan.hlo.AllergiesHlo;

@Repository("allergiesDao")
public class AllergiesDaoImpl extends AbstractDao implements AllergiesDao {

	// Registering to Logger
	private static final Logger logger = Logger
			.getLogger(AllergiesDaoImpl.class);

	@Override
	public void save(AllergiesHlo allergiesHlo) {
		persist(allergiesHlo);

	}

	@Override
	public void modify(AllergiesHlo allergiesHlo) {
		update(allergiesHlo);
	}

	@Override
	public void delete(AllergiesHlo allergiesHlo) {
		delete(allergiesHlo);
	}

	@Override
	public AllergiesHlo findAllergiesById(int id) {
		AllergiesHlo allergiesHlo = null;
		allergiesHlo = new AllergiesHlo();
		allergiesHlo = (AllergiesHlo) getSession().createQuery(
				"from AllergiesHlo al where al.id=id").uniqueResult();
		return allergiesHlo;

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AllergiesHlo> findAllAllergies() {
		List<AllergiesHlo> allergiesHlo = null;
		allergiesHlo = new ArrayList<AllergiesHlo>();
		allergiesHlo = getSession().createQuery("from AllergiesHlo ").list();
		return allergiesHlo;
	}

}
