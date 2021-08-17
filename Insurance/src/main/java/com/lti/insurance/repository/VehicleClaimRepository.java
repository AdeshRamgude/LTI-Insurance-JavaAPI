package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.VehicleClaim;

@Repository
public interface VehicleClaimRepository extends JpaRepository<VehicleClaim, Integer>{
	@Query("select c from VehicleClaim c where c.claimid =?1")
	public VehicleClaim getbyidvehicle(int id);
	
	@Query("select max(p.claimid) from VehicleClaim p")
	public int getHigestId1();
	
	@Query("select c from VehicleClaim c where c.userid =?1")
	public List<VehicleClaim> getbyidvehicle1(int id);
}
