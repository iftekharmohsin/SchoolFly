package com.frozan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.entity.School;
import com.frozan.service.SchoolSvc;

@RestController
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	private SchoolSvc schoolSvc;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Boolean insertSchool(@RequestBody School entity){
	  schoolSvc.insertSchool(entity);
	  return true;
	}
}
