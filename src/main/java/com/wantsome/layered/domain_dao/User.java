package com.wantsome.layered.domain_dao;

import com.wantsome.layered.domain_dao.constraints.NoNumbers;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    private Long id;

    @NotBlank(message = "Name is mandatory- ce mesaj vrem noi")
    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters - mesaj configurabil cum vrem noi")
    private String name;
    @NoNumbers
    private String email;

    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
