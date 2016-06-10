package com.frozan.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.service.impl.ParentSvc;

@Controller
public class ParentController {
	 @Autowired
	private ParentSvc parentSvc;
	
	
	@RequestMapping(value={"/saveParent"},method=RequestMethod.POST)
	public String saveparent( @ModelAttribute ParentHlo parentHlo,BindingResult result,HttpSession session){	
		try{
			Date newdate = new Date();
			parentHlo.setDob(newdate);
			/*parentHlo.setGender("M");
			parentHlo.setMiddleName("kumar");
			parentHlo.setLastName("Gantayat");*/
			if(null != parentHlo){
			  boolean b= parentSvc.save(parentHlo);
			  if(b){
				  ParentHlo parent= parentSvc.findParentById(parentHlo.getId());
				  if(null != parent){
					  session.setAttribute("firstname", parent.getFirstName()); 
				  }
				  return "parentpage";
			  }
			}
		}catch(Exception e){
			session.setAttribute("errMessage", e.getMessage());
		}
		return "homepage";
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.POST)
	public String loginParent( @ModelAttribute ParentHlo parentHlo,BindingResult result,HttpSession session){	
		try{
			
			if(null != parentHlo){
				 ParentHlo parent= parentSvc.findParentByEmail(parentHlo.getEmail());
				  if(null != parent){
					  session.setAttribute("firstname", parent.getFirstName()); 
					  return "parentpage";
				  }
			}
		}catch(Exception e){
			session.setAttribute("errMessage", e.getMessage());
		}
		return "redirect:";
	}

}
