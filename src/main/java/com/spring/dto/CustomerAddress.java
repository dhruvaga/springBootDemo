package com.spring.dto;


public class CustomerAddress {
    private String fullName;
    private String line1;

    public CustomerAddress() {
    }

    public CustomerAddress(String fullName, String line1) {
        this.fullName = fullName;
        this.line1 = line1;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "fullName='" + fullName + '\'' +
                ", line1='" + line1 + '\'' +
                '}';
    }
}
