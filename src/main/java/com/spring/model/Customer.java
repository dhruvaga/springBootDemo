package com.spring.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity(name = "CUSTOMER")
//@JsonIgnoreProperties(value = {"id","memberSince","addresses"}, allowGetters = true)
public class Customer {

    public enum CustomerType {RETAIL, CORPORATE}

//    private static Integer autoGen = 1000;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "cannot be null")
    private String fullName;

    private String landLine;

    @NotNull(message = "cannot be null")
    @Column(unique = true)
    private String phoneNumber;

    @NotNull(message = "cannot be null")
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Temporal(TemporalType.DATE)
    private Date memberSince;

    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY/*,mappedBy = "Customer_Id"*/)
    @JoinColumn(name = "customer_Id",referencedColumnName = "id")
    private List<Address> addresses;

    private Customer() {
//        this.customerId = ++autoGen;
        this.memberSince = new Date();
        this.addresses = new ArrayList<Address>();
    }

    public Customer(String fullName, String landLine, String phoneNumber, CustomerType customerType) {
        this();
        this.fullName = fullName;
        this.landLine = landLine;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(fullName, customer.fullName) &&
                Objects.equals(phoneNumber, customer.phoneNumber) &&
                customerType == customer.customerType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber, customerType);
    }
}
