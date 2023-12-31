package com.example.Intro.repositories;

import com.example.Intro.models.Customer;
import com.example.Intro.models.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByNameContaining(String name);
    List<Customer> findByStatus(CustomerStatus status);



}