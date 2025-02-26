package org.example;

import org.springframework.stereotype.Component;

@Component
public class ImplementationBean2 implements BeanInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("ImplementationBean2 interfaceMethod() second different implementation.");
    }
}
