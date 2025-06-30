package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.model.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long>{
    
}
