package com.frozan.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frozan.dao.AdminDao;
import com.frozan.hlo.AdminHlo;


@Service("adminService")
@Transactional
public class AdminService implements Admin  {
	
	//@Autowired 
	//AdminDao adminDao;
	
Logger logger=Logger.getLogger(AdminService.class);

	@Override
	public void save(AdminHlo admin) {
		//logger.info("inside the dao method");
		//adminDao.save(admin);
		
	}
}
