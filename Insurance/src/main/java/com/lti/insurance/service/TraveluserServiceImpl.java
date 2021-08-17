package com.lti.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.insurance.model.Traveluser;
import com.lti.insurance.repository.TraveluserRepository;

@Service
@Transactional
public class TraveluserServiceImpl implements TraveluserService{
	@Autowired
	TraveluserRepository traveluserRepo;

	@Override
	public List<Traveluser> getbyidtraveluser(int id) {
		// TODO Auto-generated method stub
		return traveluserRepo.getbyidtraveluser(id);
	}

}
