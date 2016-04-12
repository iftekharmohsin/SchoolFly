package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.AllergiesDao;
import com.frozan.hlo.AllergiesHlo;

@Service("allergiesService")
public class AllergiesService {
	@Autowired
	AllergiesDao allergiesDao;

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