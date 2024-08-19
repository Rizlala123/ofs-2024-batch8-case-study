package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.CustomerLogin;
import com.ofss.main.service.BankCustomerService;
import com.ofss.main.service.LoginService;

@RequestMapping("loginscreen")
@RestController
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("customerid/{customerId}")
    public BankCustomerDetails getCustomerByIdFromDB(@PathVariable int customerId){
        return loginService.getCustomerById(customerId);
    }

    @PostMapping("loginadd/{customerId}")
    public CustomerLogin addCustomerLoginToDB(@PathVariable int customerId,@RequestBody CustomerLogin newCustomerLogin){
        return loginService.addNewCustomerLogin(loginService.getCustomerById(customerId), newCustomerLogin);
    }

    @PostMapping("a")
    public CustomerLogin authenticateLoginByUser(@RequestBody CustomerLogin newCustomerLogin){
        if(loginService.authenticateLogin(newCustomerLogin.getUsername(),newCustomerLogin.getPassword())){
            return newCustomerLogin;
        }
        return null;
    }



}
