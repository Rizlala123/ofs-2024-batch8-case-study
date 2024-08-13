package com.ofss.main;
import java.util.List;
import java.util.Scanner;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.LoginInformation;
import com.ofss.main.service.CustomerDetailsService;
import com.ofss.main.service.Impl.CustomerDetailsServiceImpl;
import com.ofss.main.service.LoginDetailsService;
import com.ofss.main.service.Impl.LoginDetailsServiceImpl;


public class LoginContent {
    public static void main(String[] args) {
    
    LoginDetailsService LoginDetailsService = new LoginDetailsServiceImpl();
    int customerID;
    String username;
    String password;
    int attempts;
    String loginStatus;
    String continueChoice;

    try (Scanner scanner = new Scanner(System.in)) {
        do {
            System.out.println("Login Menu");
            System.out.println("    ");
            System.out.println("Enter Customer ID:");
            customerID = scanner.nextInt();
            BankCustomerDetails approvedBankCustomerDetails = LoginDetailsService.checkCustomerLoginApproval(customerID);
            System.out.println("Do you want to continue");
            continueChoice = scanner.next();

        }while (continueChoice.equals("Yes"));
}}    }
