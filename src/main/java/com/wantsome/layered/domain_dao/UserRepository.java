package com.wantsome.layered.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public List<User> findAll() {
        return List.of(
                new User(1L, "Figarro", "figaro@yahoo.com"),
                new User(2L, "Camelia", "camelia@yahoo.com"),
                new User(3L, "Julietta", "julietta@gmail.com")
        );
    }
}
