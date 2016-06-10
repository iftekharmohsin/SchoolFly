package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.service.impl.AllergiesService;

@RestController
@RequestMapping("allergies")

public class AllergiesController {

	@Autowired
	private AllergiesService allergiesService;
	
	@RequestMapping("/allergies")
	public void setAllergies(@RequestBody AllergiesHlo allergiesHlo){
		
		allergiesService.save(allergiesHlo);		
	}
	
	@RequestMapping("/allergiyById/{id}")
	@ResponseBody
	public AllergiesHlo getAllergyById(@PathVariable int id){
		
		return allergiesService.findallergiesById(id);
	}
	/*
	@RequestMapping("/allergies")
	@ResponseBody
	public List<AllergiesHlo> getAllAllergies(){
		
		return allergiesService.getAllAllergies();
	}*/
}
