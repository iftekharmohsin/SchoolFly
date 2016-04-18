package com.frozan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("showgrid")
public class CourseGridController {
	@RequestMapping(method=RequestMethod.GET)
	public String getCourseGrid()
	{
		return "coursegrid";
	}

}
