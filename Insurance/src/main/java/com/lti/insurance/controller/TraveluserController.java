package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.model.Traveluser;
import com.lti.insurance.service.TraveluserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/insuranceRest/api")
public class TraveluserController {

	@Autowired
	TraveluserService traveluserService;
	
	@GetMapping("/claim/traveluser/{id}")
	public List<Traveluser> getbyidtraveluser(@PathVariable(value="id")int id) {
		return traveluserService.getbyidtraveluser(id);
	}
}
