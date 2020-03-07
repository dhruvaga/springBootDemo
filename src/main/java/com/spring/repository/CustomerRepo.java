package com.spring.repository;

import com.spring.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CustomerRepo {

    private List<Customer> customers;

    {
        customers = new ArrayList<Customer>();
        customers.add(new Customer("dhruv agarwal","27352803",
                "9898989898", Customer.CustomerType.RETAIL));

        customers.add(new Customer("virender sehwag","27272727",
                "9797979797", Customer.CustomerType.CORPORATE));
    }

    public CustomerRepo() {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


}
