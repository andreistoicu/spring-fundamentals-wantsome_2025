package com.wantsome.repository;

import com.wantsome.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//putem utiliza si JpaRepository
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
