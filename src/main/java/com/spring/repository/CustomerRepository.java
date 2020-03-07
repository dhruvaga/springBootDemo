package com.spring.repository;

import com.spring.dto.CustomerAddress;
import com.spring.model.Address;
import com.spring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.spring.dto.CustomerAddress(c.fullName , a.line1) FROM CUSTOMER as c JOIN c.addresses as a")
    public List<CustomerAddress> getCustomerAddressJoin();

    @Query("SELECT a FROM CUSTOMER c JOIN c.addresses a WHERE c.id = ?1")
    public List<Address> getCustomerAddresses(Integer customerId);



}
