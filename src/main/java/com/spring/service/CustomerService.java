package com.spring.service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
//        List<Customer> customers = new ArrayList<Customer>();
        return customerRepository.findAll()/*.forEach(customers::add)*/;
//        return customers;
    }

    public Optional<Customer> getCustomer(Integer customerId) {
        return customerRepository.findById(customerId);
    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public boolean deleteCustomer(Integer customerId) {
        try {
            customerRepository.deleteById(customerId);
        } catch (Exception e){
            return false;
        }
        return true;
    }

}
