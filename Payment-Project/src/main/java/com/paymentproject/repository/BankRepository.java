package com.paymentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentproject.entities.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank,String> {
}
