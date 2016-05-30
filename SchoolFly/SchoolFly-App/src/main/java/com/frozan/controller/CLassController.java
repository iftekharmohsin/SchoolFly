package com.frozan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.ClassHlo;
import com.frozan.service.ClassService;

@RestController
@RequestMapping("class")
public class CLassController {

	@Autowired
	private ClassService classService;
	
	@RequestMapping(value="/addClass",method=RequestMethod.POST)
	public void addClass(@RequestBody ClassHlo classHlo){
		classService.save(classHlo);
	}
	
}
