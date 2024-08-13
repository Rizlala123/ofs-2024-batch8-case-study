package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("customer")
    public List<BankCustomerDetails> getAllCustomersFromDB(){
        
        return bankCustomerService.getAllcustomers();
    }

}
