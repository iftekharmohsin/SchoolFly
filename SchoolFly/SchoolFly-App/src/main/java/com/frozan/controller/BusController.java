package com.frozan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frozan.hlo.BusHlo; 
import com.frozan.service.impl.BusService;
@RestController
@RequestMapping("bus")
public class BusController {
/*	@Autowired
	private BusService busService;
	
	@RequestMapping(value="/saveBus",method=RequestMethod.GET)
	public void savesubject(BusHlo busHlo){	
<<<<<<< Updated upstream
		busHlo.setBusNo("10234");
=======
		//busHlo.setBusNo("10234");
>>>>>>> Stashed changes
		//busHlo.setRouteId(123);
		//busHlo.setTransportStaffId(1234);
		busService.save(busHlo);
	}
	
	@RequestMapping(value="/busById/{id}" ,method=RequestMethod.GET)
	@ResponseBody
	public BusHlo getbusById(@PathVariable int id){
		return busService.getBusByid(id);


	}
	@RequestMapping(value="/getAllbus" ,method=RequestMethod.GET)
	@ResponseBody
	public List<BusHlo> getAllBus(){
		return busService.getAllBus();



	}
*/
}
