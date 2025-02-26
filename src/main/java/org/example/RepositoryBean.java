package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryBean {

    public RepositoryBean() {
        System.out.println("RepositoryBean constructor");
    }

    public void doSomething() {
        System.out.println("RepositoryBean.doSomething()");
    }
}
