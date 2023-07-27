package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.AvailablePolicies;
@Repository
public interface AvailablePoliciesRepository extends JpaRepository<AvailablePolicies,Integer>{

}
