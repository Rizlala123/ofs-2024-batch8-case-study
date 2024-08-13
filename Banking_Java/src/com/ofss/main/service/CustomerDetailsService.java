package com.ofss.main.service;

import java.util.List;


import com.ofss.main.domain.BankCustomerDetails;

public interface CustomerDetailsService {
    List<BankCustomerDetails> getAllCustomers();
    boolean addNewCustomer(BankCustomerDetails BankCustomerDetails);

}
