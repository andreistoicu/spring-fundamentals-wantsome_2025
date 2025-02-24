package org.example;

import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;

@Repository
public class SpringBean3 {

    public SpringBean3() {
        System.out.println("SpringBean3 constructor");
    }

    @PreDestroy
    void destroy() {
        System.out.println("AppConfig destroy method in springBean 3");
    }
}
