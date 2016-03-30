package com.frozan.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.frozan.hlo.AdminHlo;
import com.frozan.service.Admin;


@Controller
@Scope("session")
@EnableWebMvc
public class AdminController   {
	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	
	@Autowired
	Admin adminService;
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, ModelMap model) {
		
		logger.info("inside the controller ");
		AdminHlo admin=new AdminHlo();
		admin.setAdminFirstName("vdsad");
		admin.setAdminLastName("Kdas");
		admin.setAdminGender("Mdasd");
		admin.setAdminMiddleName("Mdasdas");
		admin.setAdminDateOfBirth(new Date());
		
		adminService.save(admin);
		
		return "size1";
	
	}

}
