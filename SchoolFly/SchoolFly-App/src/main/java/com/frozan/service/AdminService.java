package com.frozan.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.AdminDao;
import com.frozan.dao.AdminDaoImpl;
import com.frozan.hlo.AdminHlo;

@Service("adminService")
@Transactional
public class AdminService {
	@Autowired
	AdminDaoImpl adminDaoImpl;

	public void save(AdminHlo adminHlo) {
		adminDaoImpl.save(adminHlo);
	}

	public void modify(AdminHlo adminHlo) {
		adminDaoImpl.modify(adminHlo);
	}

	public void delete(AdminHlo adminHlo) {
		adminDaoImpl.delete(adminHlo);
	}

	public AdminHlo getTimeTableByid(int id) {
		return adminDaoImpl.getTimeTableByid(id);

	}

	public List<AdminHlo> getTimeTable() {
		return adminDaoImpl.getTimeTable();
	}

}
