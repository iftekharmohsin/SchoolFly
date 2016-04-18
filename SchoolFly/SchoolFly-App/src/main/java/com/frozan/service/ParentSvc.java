package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frozan.dao.ParentDao;
import com.frozan.hlo.ParentHlo;

@Service("parentSvc")
public class ParentSvc {

	@Autowired
	ParentDao parentDao;

	public void save(ParentHlo parentHlo) {
		parentDao.save(parentHlo);
	}

	public void modify(ParentHlo parentHlo) {
		parentDao.modify(parentHlo);
	}

	public void delete(ParentHlo parentHlo) {
		parentDao.delete(parentHlo);
	}

	public List<ParentHlo> getParentById(int id) {
		return parentDao.getParentById(id);
	}

	public List<ParentHlo> getAllParents() {
		return parentDao.getAllParents();

	}

}
