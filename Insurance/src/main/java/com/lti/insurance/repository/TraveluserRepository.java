package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.insurance.model.Traveluser;

public interface TraveluserRepository extends JpaRepository<Traveluser, Integer>{

	@Query("select c from Traveluser c where c.userid =?1")
	public List<Traveluser> getbyidtraveluser(int id);
}
