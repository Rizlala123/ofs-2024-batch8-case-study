package com.ofss.main.service;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.LoginInformation;

public interface LoginDetailsService {
    BankCustomerDetails checkCustomerLoginApproval(int customerID);
    boolean addNewCustomerLogin(int customerID,LoginInformation LoginInformation);}
