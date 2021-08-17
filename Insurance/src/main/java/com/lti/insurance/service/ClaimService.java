package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.model.Claim;


public interface ClaimService {
	public List<Claim> getClaims();
	
	public boolean addClaim(Claim claim);
	public List<Claim> getStatus();
	public boolean addStatus(Claim claim);
	
	public Claim getbyid(int id);
	
	public List<Claim> getbyuserid(int id);
	
	public int highestid();
}
