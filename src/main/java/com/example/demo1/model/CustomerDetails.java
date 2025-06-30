package com.example.demo1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customerdetails")
public class CustomerDetails{
  

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
     private String email;

    @Column(name = "phone")
    private long phone;

    @Column(name = "address")
    private String address;
 
    @Column(name = "password")
     private String password;

    public CustomerDetails(){

    }
    public CustomerDetails(String name, String email, long phone, String address, String password) {
      this.name = name;
      this.email = email;
      this.phone = phone;
      this.address = address;
      this.password = password;
    }
    
    public long getId() {
      return id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public long getPhone() {
      return phone;
    }
    public void setPhone(long phone) {
      this.phone = phone;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public String getPassword() {
      return password;
    }
    public void setPassword(String password) {
      this.password = password;
    }
   

}