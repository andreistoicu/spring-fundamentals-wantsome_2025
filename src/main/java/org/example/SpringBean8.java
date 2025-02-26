package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean8 {

    private double index;

    public SpringBean8() {
        index = Math.random();
        System.out.println("SpringBean8 constructor: " + index);
    }

    public void doSomething() {
        System.out.println("SpringBean8.doSomething()");
    }

    public double getIndex() {
        return index;
    }
}
