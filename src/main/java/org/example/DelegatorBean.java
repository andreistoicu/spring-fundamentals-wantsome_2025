package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DelegatorBean {

    private List<BeanInterface> beanList;

    public DelegatorBean(List<BeanInterface> beanList) {
        this.beanList = beanList;
    }

    @PostConstruct
    void init(){
        System.out.println("DelegatorBean init method");
        for (BeanInterface bean : beanList) {
            bean.interfaceMethod();
        }
    }
}
