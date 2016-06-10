package com.frozan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;


@Controller
public class AdminController   {
	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	//@AutowiredadminHome
	//AdminService adminService;
	
	/*@Autowired
	private StudentSvc studentSvc;*/
	
	/*@RequestMapping(value = "/adminhome/{username}/{password}", method = RequestMethod.POST)
	public (Model model,@RequestParam("username") String username, @RequestParam("password") String password) {
		model.addAttribute("secondPageMessage", "This is the second page");
		if(username.equals(password)){
			return "adminhome";
		}
		return "adminlogin";
	}*/
	

}
