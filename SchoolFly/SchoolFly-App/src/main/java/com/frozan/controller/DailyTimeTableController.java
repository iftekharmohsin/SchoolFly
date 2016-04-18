package com.frozan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.DailyTimeTableHlo;
import com.frozan.service.DailyTimeTableSvc;

@RestController
@RequestMapping("dailytimetable")
public class DailyTimeTableController {

	@Autowired
	private DailyTimeTableSvc dailyTimeTableSvc;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	 public void addTimeDatble(@RequestBody DailyTimeTableHlo dailyTimeTableHlo){
		 dailyTimeTableSvc.save(dailyTimeTableHlo);
		 }
	
	@RequestMapping(value="/modify",method=RequestMethod.PUT)
	public void changeTimeTable(@RequestBody DailyTimeTableHlo dailyTimeTableHlo){
		dailyTimeTableSvc.modify(dailyTimeTableHlo);
	}
	
	public DailyTimeTableHlo getTimeTableBySectionId(@PathVariable int sectionId){
		return dailyTimeTableSvc.getTimeTableByid(sectionId);  				
	}
}
