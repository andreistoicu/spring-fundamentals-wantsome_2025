package com.wantsome.layered.databases.service;

import com.wantsome.layered.databases.dao_repository_domain.entity.Customer;
import com.wantsome.layered.databases.dao_repository_domain.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);

        //save new Employee responsible for the Customer
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
