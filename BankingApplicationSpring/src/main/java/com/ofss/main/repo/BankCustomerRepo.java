package com.ofss.main.repo;

import org.springframework.data.repository.CrudRepository;

import com.ofss.main.domain.BankCustomerDetails;

public interface BankCustomerRepo extends CrudRepository<BankCustomerDetails,Integer>{

}
