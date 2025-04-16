package recap.spring_moderate_exercises.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//circular dependency - A object needs a B instance to exists at its creation time
@Component
public class A {
    @Autowired
    private B b;
}


