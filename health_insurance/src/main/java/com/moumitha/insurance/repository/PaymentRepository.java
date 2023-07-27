package com.moumitha.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moumitha.insurance.entities.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
