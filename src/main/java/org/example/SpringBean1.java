package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("SpringBean1 constructor");
    }

    @PreDestroy
    void destroy() {
        System.out.println("AppConfig destroy method in springBean 1");
    }
}
