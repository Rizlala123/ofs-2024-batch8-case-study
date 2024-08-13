package com.ofss.main.repository;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.LoginInformation;

public interface LoginDetailsRepo {
    BankCustomerDetails checkCustomerLoginApproval(int customerID);
    boolean addNewCustomerLogin(int customerID,LoginInformation LoginInformation);
    boolean validateCustomerLogin(LoginInformation LoginInformation);
}
