package com.frozan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.hlo.TeacherHlo;
import com.frozan.service.impl.StudentSvc;

@Controller
public class IndexController {
	
private static final Logger logger = Logger.getLogger(AdminController.class);
	
	//@Autowired
	//AdminService adminService;
	
	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(value = { "/kidzone", "/" }, method = RequestMethod.GET)
	public String firstPage(ModelMap model) {
		System.out.println("******************************here *************************");
		
		model.addAttribute("parentVo", new ParentHlo());
		model.addAttribute("studentVo", new StudentHlo());
		model.addAttribute("teacherVo", new TeacherHlo());
		
		return "homepage";
	}
	
	@RequestMapping(value = { "/parent"}, method = RequestMethod.GET)
	public String parentPage(Model model) {
		model.addAttribute("firstPageMessage", "This is the first page");
		return "parentpage";
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.GET)
	public String teacherPage(Model model) {
		model.addAttribute("secondPageMessage", "This is the second page");
		return "teacherpage";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String studentPage(Model model) {
		model.addAttribute("secondPageMessage", "This is the second page");
		return "studentpage";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminLogin(Model model) {
		model.addAttribute("secondPageMessage", "This is the second page");
		return "adminlogin";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model,HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null){
			session.invalidate();
		}
		return "redirect:";
	}
	

}
