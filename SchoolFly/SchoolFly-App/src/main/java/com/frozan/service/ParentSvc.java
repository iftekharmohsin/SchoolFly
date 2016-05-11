package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.ParentDao;
import com.frozan.hlo.ParentHlo;

@Service("parentSvc")
@Transactional
public class ParentSvc {

	@Autowired
	ParentDao parentDao;

	public boolean save(ParentHlo parentHlo) {
		boolean b= parentDao.save(parentHlo);
		if(b){
			return true;
		}
		return false;
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

	public ParentHlo findParentById(int id) {
		
		return parentDao.findById(id);
		
	}

	public ParentHlo findParentByEmail(String email) {
		return parentDao.findByMail(email);
	}

}
