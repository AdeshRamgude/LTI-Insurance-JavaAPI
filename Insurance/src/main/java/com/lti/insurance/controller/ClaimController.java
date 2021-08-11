package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.insurance.model.Claim;
import com.lti.insurance.service.ClaimService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/insuranceRest/api")
public class ClaimController {
	@Autowired
	ClaimService claimService;
	
	@GetMapping("/claim")
	public List<Claim> getAll(){
		return claimService.getClaims();
	}
	
	@PostMapping("/claim")
	public boolean addClaim(@RequestBody Claim claim) {
		return claimService.addClaim(claim);
	}
}
