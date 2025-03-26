package com.wantsome.layered.databases.controllers;

import com.wantsome.layered.databases.dao.Customer;
import com.wantsome.layered.databases.service.CustomerService;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

    @PostConstruct
    void init() {
        Customer customer = new Customer();
        customer.setName("John Smith");

        System.out.println("Saving Customer .... " + customer);

        customerService.saveCustomer(customer);

        Customer findedCustomer = customerService.findById(customer.getId());
        System.out.println("Found customer = "  + findedCustomer);

        List<Customer> clients = customerService.findAll();

        for (Customer c : clients) {
            System.out.println("Found customers by findAll() "  + c);
        }

    }
}
