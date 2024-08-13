package com.ofss.main.service.Impl;

import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.repository.AdminDetailsRepo;
import com.ofss.main.repository.Impl.AdminDetailsRepoImpl;
import com.ofss.main.service.AdminDetailsService;

public class AdminDetailsServiceImpl implements AdminDetailsService{
    private AdminDetailsRepo adminRepository = new AdminDetailsRepoImpl();

    @Override
    public List<BankCustomerDetails> getAllCustomersAdmin() {
    return adminRepository.getAllCustomersAdmin();
    }

    @Override
    public boolean approveCustomer(BankCustomerDetails BankCustomerDetails) {
        return adminRepository.approveCustomer(BankCustomerDetails);
    }
}