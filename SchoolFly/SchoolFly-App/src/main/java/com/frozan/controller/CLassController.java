package com.frozan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.ClassHlo;
import com.frozan.service.impl.ClassService;

@RestController
@RequestMapping("class")
public class CLassController {

	@Autowired
	private ClassService classService;
	
	@RequestMapping(value="/addClass",method=RequestMethod.GET)
	public void addClass(/*@RequestBody ClassHlo classHlo*/){
		
		ClassHlo h=new ClassHlo();
		h.setClassName("3rd");
		classService.save(h);
		
	}
}
