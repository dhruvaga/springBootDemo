package com.spring.controller;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
//@JsonView(Views.Public.class)
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.GET , value = "/customers")
    public ResponseEntity getCustomers(){
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @RequestMapping(method = RequestMethod.GET , value = "/customers/{customerId}")
    public ResponseEntity getCustomer(@PathVariable Integer customerId){
        return ResponseEntity.ok(customerService.getCustomer(customerId));
    }

    @RequestMapping(method = RequestMethod.GET , value = "/customeraddress")
    public ResponseEntity getCustomerAddress(){
        return ResponseEntity.ok(customerRepository.getCustomerAddressJoin());
    }

    @RequestMapping(method = RequestMethod.POST , value = "/customers")
    public ResponseEntity addCustomers(@Valid @RequestBody Customer customer){
        customerService.addCustomer(customer);
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/customers/{customerId}")
    public ResponseEntity deleteCustomer(@PathVariable Integer customerId){
        return ResponseEntity.ok(customerService.deleteCustomer(customerId));
    }



}
