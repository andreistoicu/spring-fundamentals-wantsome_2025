package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class SpringBean6 {

    private final SpringBean5 springBean5;
    private final ServiceBean serviceBean;

    @Autowired
    public SpringBean6(SpringBean5 springBean5, ServiceBean serviceBean) {
        this.springBean5 = springBean5;
        this.serviceBean = serviceBean;
        System.out.println("SpringBean6 constructor");
    }

    @PostConstruct
    void init() {
        System.out.println("SpringBean6.init()");
        springBean5.doSomething();
    }
}
