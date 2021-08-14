package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.model.Vehicleinsurance;
import com.lti.insurance.service.VehicleinsuranceService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/insuranceRest/api")
public class VehicleinsuranceController {
	
	@Autowired
	VehicleinsuranceService vehicleinsuranceService;
	
	@GetMapping("/vehicleinsurance/{id}")
	public List<Vehicleinsurance> getbyidvehicleinsurance(@PathVariable(value="id")int id) {
		return vehicleinsuranceService.getbyidvehicleinsurance(id);
	}
}
