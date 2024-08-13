package com.ofss.main;

import java.util.List;
import java.util.Scanner;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.service.CustomerDetailsService;
import com.ofss.main.service.Impl.CustomerDetailsServiceImpl;

public class CustomerDetailsCRUD {
public static void main(String[] arg){
    CustomerDetailsService CustomerDetailsService = new CustomerDetailsServiceImpl();
    int customerID;
    String f_name;
    String l_name;
    String address;
    String city;
    String state;
    int zip;
    String email;
    int phone;
    int cell;
    String bank_customer_approval_status="UNAPPROVED";
    String continueChoice;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Customer CRUD Menu");
                System.out.println("1. Print All Customer");
                System.out.println("2. Add new Customer");
                System.out.println("3. Approve Customer");
                System.out.println("Enter your choice");
                int crudChoice = scanner.nextInt();

                switch (crudChoice) {
                    case 1:
                        System.out.println("All Employees From Database");
                        List<BankCustomerDetails> customerList = CustomerDetailsService.getAllCustomers();
                        for (BankCustomerDetails customer : customerList) {
                            System.out.println(customer);
                        }
                        break;
                    case 2:
                    System.out.println("Enter First Name:");
                    f_name = scanner.next();
            
                    System.out.println("Enter Last Name:");
                    l_name = scanner.next();
            
                    System.out.println("Enter Address:");
                    address = scanner.next();
            
                    System.out.println("Enter City:");
                    city = scanner.next();
            
                    System.out.println("Enter State:");
                    state = scanner.next();
            
                    System.out.println("Enter Zip Code:");
                    zip = scanner.nextInt();
            
                    System.out.println("Enter Email:");
                    email = scanner.next();
            
                    System.out.println("Enter Phone Number:");
                    phone = scanner.nextInt();
            
                    System.out.println("Enter Cell Number:");
                    cell = scanner.nextInt();

                        BankCustomerDetails addCustomer = new BankCustomerDetails(0,f_name, l_name, address, city, state, zip, email, phone, cell, bank_customer_approval_status);
                        boolean result = CustomerDetailsService.addNewCustomer(addCustomer);
                        if (result)
                            System.out.println("Employee updated successfully");
                        else
                            System.out.println("Failed to update employee");

                        break;
        
                    
                    
                        default:
                        System.out.println("Invalid Choice");
                        break;
            }
            System.out.println("Do you want to continue");
            continueChoice = scanner.next();

}while (continueChoice.equals("Yes"));
}}}



