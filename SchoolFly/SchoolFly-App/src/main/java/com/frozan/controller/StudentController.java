 package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.frozan.hlo.StudentHlo;
import com.frozan.service.DailyTimeTableSvc;
import com.frozan.service.StudentSvc;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentSvc studentSvc;

	@Autowired
	private DailyTimeTableSvc dailyTimeTableSvc;
	//*******Student**************
	//get Student by id
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public StudentHlo getStudentById(String studentId){
		return new StudentHlo();
	}
	//save new Student
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void saveStudent( @RequestBody StudentHlo studentHlo){		
		studentSvc.save(studentHlo);
	}
	
	//update existing  Student
		@RequestMapping(value="/update",method=RequestMethod.PUT)
		public void updateStudent( @RequestBody StudentHlo studentHlo){		
			studentSvc.modify(studentHlo);
		}
	/*@RequestMapping(value="/studentById" ,method=RequestMethod.GET)
	@ResponseBody
	public Stu 
	dentHlo getStudentById(@PathVariable int id){
		return studentSvc.getStudentById(id);
	}*/
	@RequestMapping(value="/getAll" ,method=RequestMethod.GET)
	@ResponseBody
	public List<StudentHlo> getAllStudent(){		

		return studentSvc.getAllStudent();
    }
	
	//get student by class id
	@RequestMapping(value="/byClassId",method=RequestMethod.GET)
	public void getStudentByClassID( @RequestBody StudentHlo studentHlo){		
		//TODO:get student by class id
	}
	
	//get student by parent id
		@RequestMapping(value="/byParentId",method=RequestMethod.GET)
		public void getParentByClassID( @RequestBody StudentHlo studentHlo){		
			//TODO:get student by parentid
		}
	
}
