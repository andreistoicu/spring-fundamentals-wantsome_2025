package com.wantsome.layered.databases.dao;

import jakarta.persistence.*;

@Entity
@Table(name="customer_table")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // este recomandat sa utilizam aceasta adnotare insa nu oblogatoriu daca numele campului este identic cu coloana din DB
    @Column(name="name", nullable = false, length = 100)
    private String name;

    @Embedded
    private Address address;

    @Transient
    private String CNP;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", version='" + version + '\'' +
                '}';
    }
}
