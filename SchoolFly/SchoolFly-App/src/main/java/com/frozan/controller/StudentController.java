package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
	public void saveStudent( @RequestBody StudentHlo studentHlo){		

		studentSvc.save(studentHlo);
	}
	
	@RequestMapping(value="/studentById/{id}" ,method=RequestMethod.GET)
	@ResponseBody
	public StudentHlo getStudentById(@PathVariable int id){
		return studentSvc.getStudentById(id);
	}
	@RequestMapping(value="/getAllstudents" ,method=RequestMethod.GET)
	@ResponseBody
	public List<StudentHlo> getAllStudent(){		

		return studentSvc.getAllStudent();
	}
	
	
}
