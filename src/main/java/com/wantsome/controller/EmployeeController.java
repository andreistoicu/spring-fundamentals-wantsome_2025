package com.wantsome.controller;

import com.wantsome.domain.Employee;
import com.wantsome.exception.NoEmployeesException;
import com.wantsome.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){
        employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }

}
