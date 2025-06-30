package com.example.demo1.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "payments")

public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column(name = "booking_id")
    private String booking_id;

    @Column(name = "paymentdate")
     private Date paymentdate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "paymentstatus")
    private String paymentstatus;

    public Payment() {
    }

    public Payment(String booking_id, Date paymentdate, double amount, String paymentstatus) {
        this.booking_id = booking_id;
        this.paymentdate = paymentdate;
        this.amount = amount;
        this.paymentstatus = paymentstatus;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    
}
