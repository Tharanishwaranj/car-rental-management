package com.example.demo1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cardetails")

public class CarDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long car_id;
    
    @Column(name = "model")
    private String model;

    @Column(name = "brand")
     private String brand;

    @Column(name = "fueltype")
    private String fuelType;

    @Column(name = "registrationno")
    private String registrationno;
 
    @Column(name = "rentPerDay")
     private Double rentPerDay;

   // @Enumerated(EnumType.STRING)
   // private CarStatus status = CarStatus.AVAILABLE;

     @Column(name = "status")
     private String status;

    public CarDetails(){

    }

    public CarDetails(String model, String brand, String fuelType, String registrationno, Double rentPerDay,
            String status) {
        this.model = model;
        this.brand = brand;
        this.fuelType = fuelType;
        this.registrationno = registrationno;
        this.rentPerDay = rentPerDay;
        this.status = status;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationno() {
        return registrationno;
    }

    public void setRegistrationno(String registrationno) {
        this.registrationno = registrationno;
    }

    public Double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(Double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCar_id() {
        return car_id;
    }
 
}
