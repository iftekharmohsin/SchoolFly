package com.frozan.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.frozan.dao.interfaces.AbstractDao;
import com.frozan.dao.interfaces.SectionDao;
import com.frozan.hlo.SectionHlo;

@Repository("sectionDao")
public class SectionDaoImpl extends AbstractDao implements SectionDao {

	
	// Registering to Logger
	private static final Logger logger = Logger.getLogger(SectionDaoImpl.class);

	@Override
	public void save(SectionHlo sectionHlo) {
		persist(sectionHlo);
	}
	@Override
	public void modify(SectionHlo sectionHlo) {
		update(sectionHlo);
	}
	@Override
	public void delete(SectionHlo sectionHlo) {
		delete(sectionHlo);
	}
	@Override
	public SectionHlo getSectionById(int id)

	{
		SectionHlo sectionHlo = null;
		sectionHlo = new SectionHlo();
		sectionHlo = (SectionHlo) getSession().createQuery(
				"from BusHlo b where b.id=id").uniqueResult();
		return sectionHlo;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<SectionHlo> getAllSections() {
		List<SectionHlo> sectionHlo = null;
		sectionHlo = new ArrayList<SectionHlo>();
		sectionHlo = getSession().createQuery("from SectionHlo ").list();
		return sectionHlo;
	}

}
