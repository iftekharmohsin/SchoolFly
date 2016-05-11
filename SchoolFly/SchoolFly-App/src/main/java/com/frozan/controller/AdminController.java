package com.frozan.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.hlo.TeacherHlo;
import com.frozan.service.AdminService;
import com.frozan.service.StudentSvc;


@Controller
public class AdminController   {
	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	//@Autowired
	//AdminService adminService;
	
	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(value = "/adminhome", method = RequestMethod.POST)
	public String adminHome(Model model,@RequestParam("username") String username,@RequestParam("password") String password) {
		model.addAttribute("secondPageMessage", "This is the second page");
		if(username.equals(password)){
			return "adminhome";
		}
		return "adminlogin";
	}
	

}
