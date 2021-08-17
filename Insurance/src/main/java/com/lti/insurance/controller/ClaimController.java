package com.lti.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Claim> getAllClaims(){
		return claimService.getClaims();
	}
	
	@PostMapping("/claim")
	public boolean addClaim(@RequestBody Claim claim) {
		return claimService.addClaim(claim);
	}
	
	@GetMapping("/admin")
	public List<Claim> getAllStatus(){
		return claimService.getStatus();
	}
	
	@PostMapping("/admin")
	public boolean addStatus(@RequestBody Claim claim) {
		return claimService.addStatus(claim);
	}
	
	@GetMapping("/admin/{id}")
	public Claim getbyid(@PathVariable(value="id")int id) {
		return claimService.getbyid(id);
	}
	
	@GetMapping("/claim/{id}")
	public List<Claim> getbyuserid(@PathVariable(value="id")int id) {
		return claimService.getbyuserid(id);
	}
	
	@GetMapping("/highestid")
	public int getHigestId() {
		return claimService.highestid();
	}
}
