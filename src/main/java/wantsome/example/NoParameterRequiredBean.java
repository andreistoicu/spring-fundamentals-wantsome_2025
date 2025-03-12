package wantsome.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class NoParameterRequiredBean {

    private SpringBean7 springBean7;

    @Autowired
    public void setSpringBean7(SpringBean7 springBean7) {
        this.springBean7 = springBean7;
    }

    @PostConstruct
    void init() {
        System.out.println("NoParameterRequiredBean init()");
        springBean7.doSomething();
    }
}
