package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;

public interface BankCustomerService {
    public List<BankCustomerDetails> getAllcustomers();
    public BankCustomerDetails addNewcustomer(BankCustomerDetails customer);
    
} 