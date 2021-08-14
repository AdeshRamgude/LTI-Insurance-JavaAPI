package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.model.VehicleClaim;

public interface VehicleClaimService {
	public List<VehicleClaim> getVehicleClaims();
	public boolean addVehicleClaim(VehicleClaim vehicleclaim);
	
	public List<VehicleClaim> getVehicleStatus();
	public boolean addVehicleStatus(VehicleClaim vehicleclaim);
	
	public boolean addVehicleStatus1(VehicleClaim vehicleclaim);
	
	public VehicleClaim getbyidvehicle(int id);
}
