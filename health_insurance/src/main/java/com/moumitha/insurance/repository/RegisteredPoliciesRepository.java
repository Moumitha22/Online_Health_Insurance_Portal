package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.RegisteredPolicies;
@Repository
public interface RegisteredPoliciesRepository extends JpaRepository<RegisteredPolicies,Integer>{

}
