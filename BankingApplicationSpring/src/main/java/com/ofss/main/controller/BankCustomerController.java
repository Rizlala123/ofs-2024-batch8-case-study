package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.service.BankCustomerService;

@RequestMapping("customerapi")
@RestController
@CrossOrigin("*")
public class BankCustomerController {

    @Autowired
    private BankCustomerService bankCustomerService;

    @GetMapping("customers")
    public List<BankCustomerDetails> getAllCustomersFromDB(){
    
        return bankCustomerService.getAllcustomers();
    }

    @PostMapping("customeradd")
    public BankCustomerDetails addCustomersToDB(@RequestBody BankCustomerDetails newCustomer){
        newCustomer.setBank_customer_approval_status("Approved");
        return bankCustomerService.addNewcustomer(newCustomer);
    }

}
