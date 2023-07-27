package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Policies;
@Repository
public interface PoliciesRepository extends JpaRepository<Policies,Integer>{

}
