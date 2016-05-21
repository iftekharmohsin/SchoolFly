package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.SectionDaoImpl;
import com.frozan.hlo.SectionHlo;

@Service("sectionService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class SectionService {
	@Autowired
	SectionDaoImpl sectionDao;

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
