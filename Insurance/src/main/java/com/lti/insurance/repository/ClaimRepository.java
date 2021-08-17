package com.lti.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.insurance.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer>{
	@Query("select c from Claim c where c.userid =?1")
	public List<Claim> getbyuserid(int id);

	@Query("select max(p.claimid) from Claim p")
	public int getHigestId();
}
