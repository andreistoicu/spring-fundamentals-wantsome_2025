package org.example;

import org.springframework.stereotype.Component;

@Component
public class ImplementationBean3 implements BeanInterface{
    @Override
    public void interfaceMethod() {
        System.out.println("ImplementationBean3 interfaceMethod() third  implementation desired.");
    }
}
