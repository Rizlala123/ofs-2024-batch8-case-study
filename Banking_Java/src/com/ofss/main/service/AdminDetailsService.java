package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;

public interface AdminDetailsService {
    List<BankCustomerDetails> getAllCustomersAdmin();
    boolean approveCustomer(BankCustomerDetails BankCustomerDetails);
    
}
