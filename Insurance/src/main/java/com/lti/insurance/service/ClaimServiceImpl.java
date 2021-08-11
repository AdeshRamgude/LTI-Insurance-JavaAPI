package com.lti.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.insurance.model.Claim;
import com.lti.insurance.repository.ClaimRepository;

@Service
@Transactional
public class ClaimServiceImpl implements ClaimService{
	
	@Autowired
	ClaimRepository claimRepo;

	@Override
	public List<Claim> getClaims() {
		// TODO Auto-generated method stub
		return claimRepo.findAll();
	}

	@Override
	public boolean addClaim(Claim claim) {
		claimRepo.save(claim);
		return true;
	}

}
