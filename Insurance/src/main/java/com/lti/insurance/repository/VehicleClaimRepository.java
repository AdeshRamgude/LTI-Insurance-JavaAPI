package com.lti.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.VehicleClaim;

@Repository
public interface VehicleClaimRepository extends JpaRepository<VehicleClaim, Integer>{

}
