package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;

public interface CustomerDetailsRepo {
    List<BankCustomerDetails> getAllCustomers();
    boolean addNewCustomer(BankCustomerDetails BankCustomerDetails);
    
}
