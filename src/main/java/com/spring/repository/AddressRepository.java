package com.spring.repository;

import com.spring.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    /*List<Address> findByCustomerId(Integer customerId);

    Optional<Address> findByAddressIdAndCustomerId(Integer addressId, Integer customerId);
*/
    @Query(value = "SELECT a.* from ADDRESS a WHERE a.CUSTOMER_ID = ?1" , nativeQuery = true)
    public List<Address> getAddressesByCustomerId(Integer customerId);
    

}
