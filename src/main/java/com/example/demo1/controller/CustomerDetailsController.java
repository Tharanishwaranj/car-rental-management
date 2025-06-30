package com.example.demo1.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.CustomerDetails;
import com.example.demo1.repository.CustomerDetailsRepository;

@RestController
@RequestMapping("/api")

public class CustomerDetailsController {
    @Autowired
    CustomerDetailsRepository customerDetailsRepositry;

    @GetMapping("/customerdetails/{id}")
    public ResponseEntity<CustomerDetails> getCustomerDetailsById(@PathVariable("id")long id){
        Optional<CustomerDetails> Customerdata = customerDetailsRepositry.findById(id);
            if( Customerdata.isPresent()){
                return new ResponseEntity<>(Customerdata.get(),HttpStatus.OK);
            }
            else{
                 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

    }

    @PostMapping("/customerdetails")
    public ResponseEntity<CustomerDetails> createCustomerDetails(@RequestBody CustomerDetails customer ){
        try{
            CustomerDetails cc = new CustomerDetails(customer.getName(),customer.getEmail(),customer.getPhone(),customer.getAddress(),customer.getPassword());
            CustomerDetails _customer = customerDetailsRepositry.save(cc);
            return new ResponseEntity<>(_customer,HttpStatus.CREATED);
        }
        catch(Exception e){
                     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("/customerdetails/{id}")
    public ResponseEntity<CustomerDetails> updateCustomerDetails(@PathVariable("id")long id , @RequestBody CustomerDetails customer ) {
        Optional<CustomerDetails> Customerdata = customerDetailsRepositry .findById(id);

        if(Customerdata.isPresent()){
            CustomerDetails _Customer = Customerdata.get();
            _Customer .setName(customer.getName());
            _Customer .setEmail(customer.getEmail());
             _Customer.setPhone(customer.getPhone());
            _Customer .setAddress(customer.getAddress());
            _Customer .setPassword(customer.getPassword());  
           return new ResponseEntity<>(customerDetailsRepositry.save(_Customer),HttpStatus.OK);
        }
        else{
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

   @DeleteMapping("/customerdetails/{id}")
    public ResponseEntity<HttpStatus> deletecustomerdetail(@PathVariable("id") long id){
        try{
            customerDetailsRepositry.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
  
   @DeleteMapping("/customerdetails")
   public ResponseEntity<HttpStatus> deleteAllcustomer(){
   try{
    customerDetailsRepositry.deleteAll();
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }
   catch(Exception e){
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
   }
   }

    @GetMapping("/customerdetails")
   public ResponseEntity<List<CustomerDetails>>findByname(){
    try{
        List<CustomerDetails> customer = customerDetailsRepositry.findByName("tharanis");
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    catch(Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
   }
}