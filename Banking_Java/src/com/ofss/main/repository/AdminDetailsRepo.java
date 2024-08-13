package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;

public interface AdminDetailsRepo {
    List<BankCustomerDetails> getAllCustomersAdmin();
    boolean approveCustomer(BankCustomerDetails BankCustomerDetails);
}
