package com.wantsome.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String city;
    private String email;
    private String role;
    //@ManyToOne
    //@JoinColumn(name="department_id", nullable=false)
    //private Department department;

    public Employee(long id, String name, String city, String email, String role/*, Department department*/) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
        this.role = role;
        //this.department = department;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*public Department getDepartment() {
        return department;
    }*/

    /*public void setDepartment(Department department) {
        this.department = department;
    }*/

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", role=" + role + ", department=" /*+ department*/ + '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(city, employee.city) && Objects.equals(email, employee.email) && Objects.equals(role, employee.role) && Objects.equals(department, employee.department);
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(id, name, city, email, role, department);
    }*/
}
