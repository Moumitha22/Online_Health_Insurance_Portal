package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Claim;
@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer>{

}
