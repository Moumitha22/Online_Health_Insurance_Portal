package com.moumitha.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moumitha.insurance.entities.Policies;
import com.moumitha.insurance.repository.PoliciesRepository;


@Service
public class PoliciesService {
	@Autowired
	private PoliciesRepository policyRepo;
	
	public boolean addPolicy(Policies c){
		return policyRepo.save(c)!= null;
	}
	public List<Policies> getAllPolicies(){
		return policyRepo.findAll();
	}
	public Policies getPolicyById(int id){
		return policyRepo.findById(id).get();
	}
	public void updatePolicy(Policies p) {
		policyRepo.saveAndFlush(p);
	}
}