package com.frozan.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.StudentHlo;
import com.frozan.service.StudentSvc;

@RestController
@RequestMapping("student")
public class StudentController {

	private StudentSvc studentSvc;
	
	public void saveStudent(@RequestBody StudentHlo studentHlo){
		
		studentHlo.setId(1);
		studentHlo.setStdDateOfBirth(new Date());
		studentHlo.setStdFirstName("iftekhar");
		studentHlo.setStdMiddleName("mohsin");
		studentHlo.setStdLastName("mohammad");
		studentHlo.setStdGender("male");
		studentSvc.save(studentHlo);
	}
	
	@RequestMapping(value="/studentById/{id}")
	@ResponseBody
	public StudentHlo getStudentById(@PathVariable int id){
		return studentSvc.getStudentById(id);
	}
}
