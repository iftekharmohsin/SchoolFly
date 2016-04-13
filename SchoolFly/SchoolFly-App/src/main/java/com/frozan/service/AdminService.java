package com.frozan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.AdminDao;
import com.frozan.hlo.AdminHlo;

@Service("adminService")
@Transactional
public class AdminService {
	
	@Autowired
	AdminDao adminDao;

	public void save(AdminHlo adminHlo) {
		adminDao.save(adminHlo);
	}

	public void modify(AdminHlo adminHlo) {
		adminDao.modify(adminHlo);
	}

	public void delete(AdminHlo adminHlo) {
		adminDao.delete(adminHlo);
	}

	public AdminHlo getAdminByid(int id) {
		return adminDao.getAdminById(id);

	}

	public List<AdminHlo> getTimeTable() {
		return adminDao.getAllAdmin();
	}

}
