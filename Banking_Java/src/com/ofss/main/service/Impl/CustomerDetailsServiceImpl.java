package com.ofss.main.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.repository.CustomerDetailsRepo;
import com.ofss.main.repository.Impl.CustomerDetailsRepoImpl;
import com.ofss.main.service.CustomerDetailsService;



public class CustomerDetailsServiceImpl implements CustomerDetailsService{

    private CustomerDetailsRepo customerRepository = new CustomerDetailsRepoImpl();
    
    @Override
    public List<BankCustomerDetails> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public boolean addNewCustomer(BankCustomerDetails BankCustomerDetails) {
      return customerRepository.addNewCustomer(BankCustomerDetails); 
    }




}
