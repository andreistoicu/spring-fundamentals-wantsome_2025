package org.example;

import org.springframework.stereotype.Service;

@Service
public class SpringBean5 {

    public SpringBean5() {
        System.out.println("SpringBean5 constructor");
    }
    
    public void doSomething() {
        System.out.println("SpringBean5.doSomething()");
    }
}
