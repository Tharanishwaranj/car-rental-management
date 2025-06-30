package com.example.demo1.model;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long booking_id;

    // @ManyToOne
    //@JoinColumn(name = "user_id")

     @Column(name = "user_id")
    private String user_id;

    @Column(name = "car_id")
     private String car_id;

    @Column(name = "bookingdate")
    private Date bookingdate;

    @Column(name = "returndate")
    private Date returndate;
 
    @Column(name = "bookingstatus")
     private Double bookingstatus;

    public Booking() {
    }

    public Booking(Date bookingdate, Date returndate, Double bookingstatus) {
        this.bookingdate = bookingdate;
        this.returndate = returndate;
        this.bookingstatus = bookingstatus;
    }

    public long getBooking_id() {
        return booking_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public Date getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(Date bookingdate) {
        this.bookingdate = bookingdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Double getBookingstatus() {
        return bookingstatus;
    }

    public void setBookingstatus(Double bookingstatus) {
        this.bookingstatus = bookingstatus;
    }

    
     
}
