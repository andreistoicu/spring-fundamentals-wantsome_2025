package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Indicates this is the primary bean to be used when autowiring
public class ImplementationBean1 implements BeanInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("ImplementationBean1 interfaceMethod() first implementation.");
    }
}
