package com.ofss.main;
import java.util.List;
import java.util.Scanner;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.service.AdminDetailsService;
import com.ofss.main.service.CustomerDetailsService;
import com.ofss.main.service.Impl.AdminDetailsServiceImpl;

public class AdminDetailsCRUD {
    public static void main(String[] args) {
        AdminDetailsService AdminDetailsService = new AdminDetailsServiceImpl();
        int customerID;
        String f_name;
        String bank_customer_approval_status;
        String continueChoice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Admin CRUD Menu");
            System.out.println("1. Print All Customer Approval");
            System.out.println("2. Update Customer");
            int crudChoice = scanner.nextInt();

            boolean result;
            switch (crudChoice) {
                case 1:
                    System.out.println("All Customers From Database");
                    List<BankCustomerDetails> customerList = AdminDetailsService.getAllCustomersAdmin();
                    for (BankCustomerDetails customer : customerList) {
                        System.out.println(customer.getBank_customer_id()+" || "+customer.getF_name()+" || "+customer.getBank_customer_approval_status());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter customerId");
                    customerID = scanner.nextInt();
                    bank_customer_approval_status="APPROVED";
                    BankCustomerDetails approveCustomer = new BankCustomerDetails(customerID,bank_customer_approval_status);
                        result = AdminDetailsService.approveCustomer(approveCustomer);
                        if (result)
                            System.out.println("Employee updated successfully");
                        else
                            System.out.println("Failed to update employee");
    
                        break;  
            

                default:
                    break;
            }
            System.out.println("Do you want to continue");
            continueChoice = scanner.next();
        }while (continueChoice.equals("Yes"));

        



    }
}
