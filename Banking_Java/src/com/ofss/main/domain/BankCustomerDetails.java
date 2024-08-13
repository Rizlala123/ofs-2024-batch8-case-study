package com.ofss.main.domain;

public class BankCustomerDetails {
    // Initialize variables
    private int bank_customer_id; //final
    private String f_name;
    private String l_name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String email;
    private int phone;
    private int cell;
    private String bank_customer_approval_status;

    //Getters and Setters
    public int getBank_customer_id() {
        return bank_customer_id;
    }
    public void setBank_customer_id(int bank_customer_id) {
        this.bank_customer_id = bank_customer_id;
    }
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getL_name() {
        return l_name;
    }
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getCell() {
        return cell;
    }
    public void setCell(int cell) {
        this.cell = cell;
    }
    public String getBank_customer_approval_status() {
        return bank_customer_approval_status;
    }
    public void setBank_customer_approval_status(String bank_customer_approval_status) {
        this.bank_customer_approval_status = bank_customer_approval_status;
    }

    //Default Constructor
    public BankCustomerDetails(String bank_customer_approval_status2){
        System.out.println("Default Constructor of Customer");
    }

    public BankCustomerDetails(int bankCustomerId, String f_Name, String l_Name,
    String address, String city, String state, int zip,
    String email, int phone, int cell, String bank_customer_approval_status) {
this.bank_customer_id = bankCustomerId;
this.f_name = f_Name;
this.l_name = l_Name;
this.address = address;
this.city = city;
this.state = state;
this.zip = zip;
this.email = email;
this.phone = phone;
this.cell = cell;
this.bank_customer_approval_status = bank_customer_approval_status;
}

public BankCustomerDetails(int bankcustomerid, String bank_customer_approval_status){
    this.bank_customer_id = bankcustomerid;
    this.bank_customer_approval_status = bank_customer_approval_status;
}

public BankCustomerDetails(int bankcustomerid, String fname, String bank_customer_approval_status) {
    this.bank_customer_id = bankcustomerid;
    this.f_name = fname;
    this.bank_customer_approval_status = bank_customer_approval_status;
    }

    
public String toString() {
    return "CUSTOMER [customerId=" +bank_customer_id  + ", fullName=" + f_name +l_name+ ", " 
    + address + ", " + city + ", " + state + ", " + zip + ", " + email + ", " + phone + ", " 
    +cell+","+ bank_customer_approval_status;
}

}
