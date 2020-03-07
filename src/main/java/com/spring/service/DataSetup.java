package com.spring.service;

import com.spring.model.Address;
import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataSetup {

    @Autowired
    private CustomerRepository customerRepository;

    public boolean CustomerDataSetup(){
        try{
            Customer customer = new Customer("dhruv agarwal","27272727","98989889898", Customer.CustomerType.RETAIL);
            customer.getAddresses().add(new Address("line 1.1","line 2.1",110034,"Delhi","DL"));
            customer.getAddresses().add(new Address("line 1.2","line 2.2",110034,"New Delhi","NDL"));
            customerRepository.save(customer);

            customer = new Customer("virender sehwag","26262626","9797979797", Customer.CustomerType.CORPORATE);
            customer.getAddresses().add(new Address("line 1.3","line 2.3",110034,"Delhi","DL"));
            customer.getAddresses().add(new Address("line 1.4","line 2.4",110034,"New Delhi","NDL"));
            customerRepository.save(customer);

        }catch (Exception ex){
            return false;
        }
        return true;
    }

}
