package com.ofss.main.service.Impl;

import java.util.Scanner;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.LoginInformation;
import com.ofss.main.repository.CustomerDetailsRepo;
import com.ofss.main.repository.LoginDetailsRepo;
import com.ofss.main.repository.Impl.CustomerDetailsRepoImpl;
import com.ofss.main.repository.Impl.LoginDetailsRepoImpl;
import com.ofss.main.service.CustomerDetailsService;
import com.ofss.main.service.LoginDetailsService;

public class LoginDetailsServiceImpl implements LoginDetailsService{
    
    private LoginDetailsRepo loginRepository = new LoginDetailsRepoImpl();

    @Override
    public BankCustomerDetails checkCustomerLoginApproval(int customerID) {
      
      String username;
      String password;
      int attempts;
      String loginStatus;
            

      BankCustomerDetails approvedBankCustomerDetails = loginRepository.checkCustomerLoginApproval(customerID);
      try (Scanner scanner = new Scanner(System.in)) {
        if(approvedBankCustomerDetails.getBank_customer_approval_status().equalsIgnoreCase("APPROVED")){
                  System.out.println(approvedBankCustomerDetails.getBank_customer_approval_status());
                  System.out.println("USERNAME");
                  username = scanner.next();
                  System.out.println("PASSWORD");
                  password = scanner.next();
                  attempts=0;
                  loginStatus="UNBLOCKED";

                  LoginInformation loginInformation=new LoginInformation(customerID,username,password,attempts,loginStatus);
                      boolean result = addNewCustomerLogin(customerID,loginInformation);
                      if (result)
                          System.out.println("Username + Password successfully");
                      else
                          System.out.println("Failed to update employee");

              }
              else{
                  System.out.println("NOT APPROVED");
              }
      }
      return approvedBankCustomerDetails;
    }

    @Override
    public boolean addNewCustomerLogin(int customerID, LoginInformation LoginInformation) {
      // TODO Auto-generated method stub
      return loginRepository.addNewCustomerLogin(customerID, LoginInformation);
    }

    }

