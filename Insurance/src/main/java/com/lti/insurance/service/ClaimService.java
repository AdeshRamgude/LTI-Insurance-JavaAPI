package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.model.Claim;


public interface ClaimService {
	public List<Claim> getClaims();
	public boolean addClaim(Claim claim);
}
