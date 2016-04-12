package com.frozan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frozan.hlo.BusHlo;
import com.frozan.hlo.SectionHlo;

@Repository("sectionDao")
public class SectionDao extends TempletDao {
	public void save(SectionHlo sectionHlo) {
		persist(sectionHlo);
	}

	public void modify(SectionHlo sectionHlo) {
		update(sectionHlo);
	}

	public void delete(SectionHlo sectionHlo) {
		delete(sectionHlo);
	}

	public SectionHlo getSectionById(int id)

	{
		SectionHlo sectionHlo = null;
		sectionHlo = new SectionHlo();
		sectionHlo = (SectionHlo) getSession().createQuery(
				"from BusHlo b where b.id=id").uniqueResult();
		return sectionHlo;
	}

	@SuppressWarnings("unchecked")
	public List<SectionHlo> getAllSections() {
		List<SectionHlo> sectionHlo = null;
		sectionHlo = new ArrayList<SectionHlo>();
		sectionHlo = getSession().createQuery("from SectionHlo ").list();
		return sectionHlo;
	}

}
