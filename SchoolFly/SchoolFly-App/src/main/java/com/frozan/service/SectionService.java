package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.SectionDao;
import com.frozan.hlo.SectionHlo;

@Service("sectionService")
public class SectionService {
	@Autowired
	SectionDao sectionDao;

	public void save(SectionHlo sectionHlo) {
		sectionDao.save(sectionHlo);
	}

	public void modify(SectionHlo sectionHlo) {
		sectionDao.modify(sectionHlo);
	}

	public void delete(SectionHlo sectionHlo) {
		sectionDao.delete(sectionHlo);
	}

	public SectionHlo findSectionById(int id) {
		return sectionDao.getSectionById(id);
	}

	public List<SectionHlo> getAllSection() {
		return sectionDao.getAllSections();
	}

}
