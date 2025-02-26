package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanProcessor {
    private final BeanInterface beanInterface1;
    private final BeanInterface beanInterface2;
    // ar trebui sa inlocuim cu o interfata, cu clasa parinte a BeanImplementation adica cu BeanInterface
    //private final ImplementationBean2 implementationBean2;
    private final BeanInterface beanInterface3;

    public BeanProcessor(BeanInterface beanInterface1,
                         @Qualifier("implementationBean3")BeanInterface beanInterface2, BeanInterface beanInterface3
                         //nu este recomandata utilizarea implementarii
                         //ImplementationBean2 implementationBean2
    ) {
        this.beanInterface1 = beanInterface1;
        this.beanInterface2 = beanInterface2;
        //nu este recomandat
        //this.implementationBean2 = implementationBean2;
        this.beanInterface3 = beanInterface3;
    }

    @PostConstruct
    public void process() {
        beanInterface1.interfaceMethod();
        beanInterface2.interfaceMethod();
        //se recomanda utilizarea interfetei
        //implementationBean2.interfaceMethod();
        beanInterface3.interfaceMethod();
    }

}
