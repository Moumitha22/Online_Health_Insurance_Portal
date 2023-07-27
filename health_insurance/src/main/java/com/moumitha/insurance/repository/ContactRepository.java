package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
