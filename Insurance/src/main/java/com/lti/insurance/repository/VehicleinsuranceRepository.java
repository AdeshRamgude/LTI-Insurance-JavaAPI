package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.Vehicleinsurance;

@Repository
public interface VehicleinsuranceRepository extends JpaRepository<Vehicleinsurance, Integer>{

	@Query("select c from Vehicleinsurance c where c.userid =?1")
	public List<Vehicleinsurance> getbyidvehicleinsurance(int id);
}
