package com.example.demo1.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "returns")

public class Return {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long returnId;

    @Column(name = "booking_id")
    private String booking_id;

    @Column(name = "actualreturndate")
     private Date actualreturndate;

    @Column(name = "latefee")
    private double latefee;

    public Return() {
    }

    public Return(String booking_id, Date actualreturndate, double latefee) {
        this.booking_id = booking_id;
        this.actualreturndate = actualreturndate;
        this.latefee = latefee;
    }

    public Long getReturnId() {
        return returnId;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public Date getActualreturndate() {
        return actualreturndate;
    }

    public void setActualreturndate(Date actualreturndate) {
        this.actualreturndate = actualreturndate;
    }

    public double getLatefee() {
        return latefee;
    }

    public void setLatefee(double latefee) {
        this.latefee = latefee;
    }

    
}
