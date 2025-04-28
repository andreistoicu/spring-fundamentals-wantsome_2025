package com.wantsome.controller;

import com.wantsome.domain.Employee;
import com.wantsome.exception.NoEmployeesException;
import com.wantsome.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        List<Employee> employees =  employeeService.getEmployees();

        if (employees.isEmpty()) {
            System.out.println("No employees are hired");
            throw new NoEmployeesException("NoEmployeesException");
        }
        return employees;
    }

}
