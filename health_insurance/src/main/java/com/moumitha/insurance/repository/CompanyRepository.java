package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>{

}
