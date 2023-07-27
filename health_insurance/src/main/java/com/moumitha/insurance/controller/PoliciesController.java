package com.moumitha.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.moumitha.insurance.entities.Policies;
import com.moumitha.insurance.service.PoliciesService;

@RestController
@RequestMapping("/policies")
@CrossOrigin(origins = "http://localhost:3000")
public class PoliciesController {
	
	@Autowired
	private PoliciesService policyService;
	@PostMapping("/")
	public boolean createClient(@RequestBody Policies p){
		return policyService.addPolicy(p);
	}
	
	@GetMapping("/")
	public List<Policies> getAllPolicies(){
		return policyService.getAllPolicies();
	}
	
	@GetMapping("/{id}")
    public Policies getPoliciesById(@PathVariable int id) {
        return policyService.getPolicyById(id);
    }
	
	@PutMapping("/put")
	public void updatePolicies(@RequestBody Policies client){
		policyService.updatePolicy(client);
	}
}