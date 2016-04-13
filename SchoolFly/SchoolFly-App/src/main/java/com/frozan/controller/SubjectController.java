package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.SubjectHlo;
import com.frozan.service.SubjectService;

@RestController
@RequestMapping("subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectSvc;
	
	@RequestMapping(value="/savesubject",method=RequestMethod.GET)
	public void savesubject(SubjectHlo subjectHlo){		
      subjectHlo=new SubjectHlo();
		//subjectHlo.setId(1);
		subjectHlo.setName("English");
		subjectHlo.setSubjectCode("123");
		subjectSvc.save(subjectHlo);
	}
	
	@RequestMapping(value="/subjectById/{id}" ,method=RequestMethod.GET)
	@ResponseBody
	public SubjectHlo getsubjectById(@PathVariable int id){
		return subjectSvc.findSubjectById(id);
	}
	@RequestMapping(value="/getAllsubjects" ,method=RequestMethod.GET)
	@ResponseBody
	public List<SubjectHlo> getAllsubject(){		

		return subjectSvc.findAllSubjects();
	}
	

}
