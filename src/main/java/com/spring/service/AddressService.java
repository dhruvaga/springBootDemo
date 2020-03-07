/*
package com.spring.service;

import com.spring.model.Address;
import com.spring.repository.AddressRepository;
import com.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddresses(Integer customerId) {
        return addressRepository.findByCustomerId(customerId);
    }

    public Object getaddress(Integer addressId) {
        return addressRepository.findById(addressId);
    }

    public void addAddress(Integer customerId, Address address) {
        customerRepository.findById(customerId).map(customer -> {
            address.setCustomer(customer);
            return addressRepository.save(address);
        });
    }

    public void deleteAddress(Integer customerId, Integer addressId) {

        addressRepository.findByAddressIdAndCustomerId(addressId,customerId).map(address -> {
            addressRepository.delete(address);
            return null;
        });
    }

}
*/
