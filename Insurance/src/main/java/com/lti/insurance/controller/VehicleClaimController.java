package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.model.VehicleClaim;
import com.lti.insurance.service.VehicleClaimService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/insuranceRest/api")
public class VehicleClaimController {
	@Autowired
	VehicleClaimService vehicleClaimService;
	
	@GetMapping("/vehicleclaim")
	public List<VehicleClaim> getAllVehicleClaim(){
		return vehicleClaimService.getVehicleClaims();
	}
	
	@PostMapping("/vehicleclaim")
	public boolean addVehicleClaim(@RequestBody VehicleClaim vehicleClaim) {
		return vehicleClaimService.addVehicleClaim(vehicleClaim);
	}

}
