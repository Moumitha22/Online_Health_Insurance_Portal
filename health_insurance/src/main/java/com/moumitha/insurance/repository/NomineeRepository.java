package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Nominee;
@Repository
public interface NomineeRepository extends JpaRepository<Nominee,Integer>{

}
