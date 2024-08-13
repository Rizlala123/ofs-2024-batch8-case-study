package com.ofss.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.repo.BankCustomerRepo;

@Service
public class BankCustomerServiceImpl implements BankCustomerService{

    @Autowired
    private BankCustomerRepo bankCustomerRepo;
    
    @Override
    public List<BankCustomerDetails> getAllcustomers() {
        return (List<BankCustomerDetails>) bankCustomerRepo.findAll();
    }

    @Override
    public BankCustomerDetails addNewcustomer(BankCustomerDetails customer) {
    
        return bankCustomerRepo.save(customer);
        
    }

}
