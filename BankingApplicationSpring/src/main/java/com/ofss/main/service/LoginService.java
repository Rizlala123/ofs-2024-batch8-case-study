package com.ofss.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.CustomerLogin;

@Service
public interface LoginService {
    
    public BankCustomerDetails getCustomerById(int customerId);  
    public CustomerLogin addNewCustomerLogin(BankCustomerDetails bankCustomerDetails,CustomerLogin newCustomer);
    public boolean authenticateLogin(String inputUsername,String inputPassword);
}
