package com.frozan.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.StudentHlo;
import com.frozan.service.AdminService;
import com.frozan.service.StudentSvc;

@RestController


public class AdminController   {
	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	//@Autowired
	//AdminService adminService;
	
	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request) {
		return "size";
	
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(HttpServletRequest request) {
		
		StudentHlo std=new StudentHlo();
    std.setStdDateOfBirth(new Date());
    std.setStdFirstName("ss");
    std.setStdLastName("las");
std.setStdMiddleName("m");	
studentSvc.save(std);
		return "size";
	
	}
	
	
	
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	@ResponseBody 
	public StudentHlo getStudent(HttpServletRequest request) {
		
		return studentSvc.getStudentById(1);
	
	}

}
