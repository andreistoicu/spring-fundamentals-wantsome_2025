package com.wantsome.service;

import com.wantsome.domain.Employee;
import com.wantsome.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        return employees;
    }
}
