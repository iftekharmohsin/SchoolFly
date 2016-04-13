package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.service.StudentSvc;

@RestController
@RequestMapping("student/{id}")
public class StudentProfileController {

	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public StudentHlo getStudent(@PathVariable int id){
		return studentSvc.getStudentById(id);
	}
	
	@RequestMapping(value="/allergies",method=RequestMethod.GET)
	@ResponseBody
	public List<AllergiesHlo> getAllergies(@PathVariable int id){
		return studentSvc.getAllergies();
	}
	
	
}
