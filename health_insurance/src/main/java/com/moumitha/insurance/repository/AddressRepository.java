package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
