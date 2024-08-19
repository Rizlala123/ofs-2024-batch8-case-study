package com.ofss.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.BankCustomerDetails;
import com.ofss.main.domain.CustomerLogin;
import com.ofss.main.repo.BankCustomerRepo;
import com.ofss.main.repo.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private BankCustomerRepo bankCustomerRepo;

    @Autowired
    private LoginRepo loginRepo;

    @Override
    public BankCustomerDetails getCustomerById(int customerId) {
        Optional<BankCustomerDetails>customerOptional = bankCustomerRepo.findById(customerId);

        if(customerOptional.isPresent()){
            return customerOptional.get();
        }
        return null;
      
    }

    @Override
    public CustomerLogin addNewCustomerLogin(BankCustomerDetails bankCustomerDetails, CustomerLogin newCustomer) {
        Optional<BankCustomerDetails>customerOptional = bankCustomerRepo.findById(bankCustomerDetails.getBank_customer_id());

        if(customerOptional.isPresent()){
            return loginRepo.save(newCustomer);
        }
        else{
            System.out.println("Make an account first");
        }
            return null;
    }

    @Override
    public boolean authenticateLogin(String inputUsername,String inputPassword) {
        Optional<CustomerLogin> customerLoginInDb = loginRepo.findById(inputUsername);
        if(customerLoginInDb.isPresent()){
            CustomerLogin customerConfirmedInDb = customerLoginInDb.get();

            if(customerConfirmedInDb.getPassword().equals(inputPassword)){

                if(customerConfirmedInDb.getLoginStatus().equalsIgnoreCase("Unblocked")){

                    return true;
                    }
                else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }

    
}
