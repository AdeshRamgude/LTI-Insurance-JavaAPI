package com.lti.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.insurance.model.Vehicleinsurance;
import com.lti.insurance.repository.VehicleinsuranceRepository;

@Service
@Transactional
public class VehicleinsuranceServiceImpl implements VehicleinsuranceService{

	@Autowired
	VehicleinsuranceRepository vehicleinsuranceRepo;
	
	@Override
	public List<Vehicleinsurance> getbyidvehicleinsurance(int id) {
		// TODO Auto-generated method stub
		return vehicleinsuranceRepo.getbyidvehicleinsurance(id);
	}

}
