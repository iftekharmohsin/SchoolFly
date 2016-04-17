package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.AllergiesHlo;
import com.frozan.hlo.BusHlo;
import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.hlo.DestinationHlo;
import com.frozan.hlo.ExamTimeTableHlo;
import com.frozan.hlo.ParentHlo;
import com.frozan.hlo.StudentHlo;
import com.frozan.service.AllergiesService;
import com.frozan.service.StudentSvc;

@RestController
@RequestMapping("student")
public class StudentProfileController {

	@Autowired
	private StudentSvc studentSvc;
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public void addStudent(@RequestBody StudentHlo studentHlo)
	{
	
		studentSvc.save(studentHlo);
	}
	
	@ResponseBody
	@RequestMapping(value="getStudent/{studentId}",method=RequestMethod.GET)
	public StudentHlo getStudentById(@PathVariable int studentId){
		return studentSvc.getStudentById(studentId);
	}
	
	@RequestMapping(value="addAllergies")
	public void addAllergies(@RequestBody AllergiesHlo allergiesHlo){
	 studentSvc.addAllergies(allergiesHlo);
	}
	@RequestMapping(value="/allergies",method=RequestMethod.GET)
	@ResponseBody
	public List<AllergiesHlo> getAllergies(@PathVariable int studentId){
		return studentSvc.getAllergies();
	}
	
	@RequestMapping(value="/bus",method=RequestMethod.GET)
	@ResponseBody
	public BusHlo getBus(@PathVariable int id){
		return studentSvc.getBus(id);
	}
	
	@RequestMapping(value="/examtimetable/{sectionId}",method=RequestMethod.GET)
	@ResponseBody
	public List<ExamTimeTableHlo> getExamTimeTable(@PathVariable int sectionId){
		return studentSvc.getExamTimeTable(sectionId);
	}
	
	@RequestMapping(value="/dailytimetable/{sectionId}",method=RequestMethod.GET)
	@ResponseBody
	public DailyTimeTableHlo getDailyTimeTable(@PathVariable int sectionId){
		return studentSvc.getDailyTimeTable(sectionId);
	}
	
	@RequestMapping(value="/destination",method=RequestMethod.GET)
	@ResponseBody
	public DestinationHlo getDestination(@PathVariable int studentId){
		return studentSvc.getDestination(studentId);
	}
	
	@RequestMapping(value="/parent",method=RequestMethod.GET)
	@ResponseBody
	public List<ParentHlo> getParent(@PathVariable int studentId){
		return studentSvc.getParent(studentId);
	}
	
	@RequestMapping(value="/setparent",method=RequestMethod.GET)
	public void setParent(@RequestBody ParentHlo parentHlo,@PathVariable int studentId){
		studentSvc.setparent(parentHlo, studentId);
		
	}
	
	@RequestMapping(value="/setdestination",method=RequestMethod.GET)
	public void setParent(@RequestBody DestinationHlo destinationHlo,@PathVariable int studentId){
		studentSvc.setDestination(destinationHlo, studentId);		
	}
	
	
}
