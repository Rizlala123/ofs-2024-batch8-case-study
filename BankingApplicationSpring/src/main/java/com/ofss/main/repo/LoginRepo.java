package com.ofss.main.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ofss.main.domain.CustomerLogin;

@Repository
public interface LoginRepo extends CrudRepository<CustomerLogin,String>{
    CustomerLogin findByUsernameAndPassword(String username,String password);

}
