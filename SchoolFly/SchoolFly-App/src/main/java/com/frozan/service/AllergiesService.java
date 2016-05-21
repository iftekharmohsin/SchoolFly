package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.impl.AllergiesDaoImpl;
import com.frozan.hlo.AllergiesHlo;

@Service("allergiesService")
@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
public class AllergiesService {
	@Autowired
	AllergiesDaoImpl allergiesDao;

	public void save(AllergiesHlo allergiesHlo) {
		allergiesDao.save(allergiesHlo);
	}

	public void modify(AllergiesHlo allergiesHlo) {
		allergiesDao.modify(allergiesHlo);
	}

	public void delete(AllergiesHlo allergiesHlo) {
		allergiesDao.delete(allergiesHlo);
	}

	public AllergiesHlo findallergiesById(int id) {
		return allergiesDao.findAllergiesById(id);
	}

	public List<AllergiesHlo> getAllAllergies() {
		return allergiesDao.findAllAllergies();
	}

}
