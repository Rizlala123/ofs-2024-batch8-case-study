package com.ofss.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.BankCustomerDetails;

@Service
public interface BankCustomerService {
    public List<BankCustomerDetails> getAllcustomers();
    public BankCustomerDetails addNewcustomer(BankCustomerDetails customer);
    
} 