package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SpringBean7 {

    private SpringBean5 springBean5;
    private ServiceBean serviceBean;
    private SpringBean8 springBean8;

    public SpringBean7() {
        System.out.println("SpringBean7 constructor");
    }

    @Autowired(required = false)
    public void setSpringBean5(SpringBean5 springBean5) {
        this.springBean5 = springBean5;
    }

    @Autowired
    public void setSeviceBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }

    @Autowired
    public void setSpringBean8(SpringBean8 springBean8) {
        this.springBean8 = springBean8;
    }


    @PostConstruct
    public void doSomething() {
        System.out.println("SpringBean7.doSomething()");
        springBean5.doSomething();
        springBean8.getIndex();
    }
}
