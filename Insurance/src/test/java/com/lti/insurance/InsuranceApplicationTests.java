package com.lti.insurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.insurance.service.ClaimService;
import com.lti.insurance.service.VehicleClaimService;

@SpringBootTest
class InsuranceApplicationTests {
	@Autowired
	ClaimService claimserv;
	
	@Autowired
	VehicleClaimService vcs;
	
	@Test
	void gethighestidclaim()
	{
		int id = claimserv.highestid();
		assertEquals(5,id);
	}
	
	 @Test
	   void testgethighestid()
	   {
		   int id=vcs.highestid1();
		   assertEquals(5,id);
	   }

}
