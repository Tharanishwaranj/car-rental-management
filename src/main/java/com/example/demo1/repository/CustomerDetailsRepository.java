package com.example.demo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.model.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails,Long>{

    List<CustomerDetails> findByName(String string); 
          
}
