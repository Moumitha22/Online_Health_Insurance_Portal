package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{

}
