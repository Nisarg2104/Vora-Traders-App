package com.example.v_power;

public class Customer {
    private String name;
    private String address;
    private long mobileNumber;
    private long officeNumber;
    private String ownerName;
    public String priority="common";
    private String customerId;

    //Getters and Setters

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(long officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
