package com.lti.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.insurance.model.VehicleClaim;
import com.lti.insurance.repository.VehicleClaimRepository;

@Service
@Transactional
public class VehicleClaimServiceImpl implements VehicleClaimService {
	@Autowired
	VehicleClaimRepository vehicleclaimRepo;
	
	@Override
	public List<VehicleClaim> getVehicleClaims() {
		// TODO Auto-generated method stub
		return vehicleclaimRepo.findAll();
	}

	@Override
	public boolean addVehicleClaim(VehicleClaim vehicleclaim) {
		// TODO Auto-generated method stub
		vehicleclaimRepo.save(vehicleclaim);
		return true;
	}

	@Override
	public List<VehicleClaim> getVehicleStatus() {
		// TODO Auto-generated method stub
		return vehicleclaimRepo.findAll();
	}

	@Override
	public boolean addVehicleStatus(VehicleClaim vehicleclaim) {
		// TODO Auto-generated method stub
		vehicleclaimRepo.save(vehicleclaim);
		return true;
	}

	@Override
	public VehicleClaim getbyidvehicle(int id) {
		// TODO Auto-generated method stub
		return vehicleclaimRepo.findById(id).get();
	}

	@Override
	public boolean addVehicleStatus1(VehicleClaim vehicleclaim) {
		// TODO Auto-generated method stub
		vehicleclaimRepo.save(vehicleclaim);
		return true;
	}



}
