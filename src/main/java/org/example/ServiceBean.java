package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ServiceBean {

    @Autowired
    private RepositoryBean repositoryBean;

    public ServiceBean() {
        System.out.println("ServiceBean constructor");
    }

    @PostConstruct
    void init() {
        System.out.println("ServiceBean.init()");
        repositoryBean.doSomething();
    }
}
