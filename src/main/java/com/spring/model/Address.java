package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "ADDRESS")
//@Table(name = "ADDRESS")
//@JsonIgnoreProperties(value = {"addressId"},allowGetters = true)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @NotNull
    private String line1;

    private String line2;

    @NotNull
    private Integer pin;

    private String city;

    private String state;


/*
    @ManyToOne*/
/*(fetch = FetchType.LAZY, optional = false)*//*

//    @JoinColumn(name = "customer_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Customer customer;
*/

    private Address() {
    }

    public Address(String line1, String line2, Integer pin, String city, String state) {
        this.line1 = line1;
        this.line2 = line2;
        this.pin = pin;
        this.city = city;
        this.state = state;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
