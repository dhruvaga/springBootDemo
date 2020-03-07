/*
package com.spring.controller;

import com.spring.repository.AddressRepository;
import com.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customers/{customerId}/addresses")
public class AddressController {

//    @Autowired
//    AddressService addressService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;


    @RequestMapping(method = RequestMethod.GET ,path = "")
    public ResponseEntity getAddresses(@PathVariable Integer customerId){
//        return ResponseEntity.ok("hello");
//        return ResponseEntity.ok(customerRepository.getCustomerAddresses(customerId));
        return ResponseEntity.ok(addressRepository.getAddressesByCustomerId(customerId));
    }

//    @RequestMapping(method = RequestMethod.GET , path = "/{addressId}")
//    public ResponseEntity getAddress(@PathVariable Integer customerId, @PathVariable Integer addressId){
//        return ResponseEntity.ok(addressService.getaddress(addressId));
//    }
//
//    @RequestMapping(method = RequestMethod.POST , path = "")
//    public ResponseEntity addAddress(@Valid @RequestBody Address address, @PathVariable Integer customerId){
//        addressService.addAddress(customerId,address);
//        return ResponseEntity.ok(addressService.getAddresses(customerId));
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE , path = "/{addressId}")
//    public ResponseEntity deleteAddress(@PathVariable Integer customerId,@PathVariable Integer addressId){
//        addressService.deleteAddress(customerId,addressId);
//        return ResponseEntity.ok().build();
//    }

}
*/
