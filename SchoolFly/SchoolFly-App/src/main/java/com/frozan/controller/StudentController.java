package com.frozan.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.StudentHlo;
import com.frozan.service.StudentSvc;

@RestController
@RequestMapping("student")
public class StudentController {

			private StudentSvc schoolSvc =new StudentSvc();
			
			@RequestMapping(value="/insert",method=RequestMethod.POST)
			@ResponseBody
			public Boolean insertStudent(@RequestBody StudentHlo studentHlo){
			  schoolSvc.save(studentHlo);
			  System.out.println("******************hello*****************************************************");
			  return true;
			}
		}

	