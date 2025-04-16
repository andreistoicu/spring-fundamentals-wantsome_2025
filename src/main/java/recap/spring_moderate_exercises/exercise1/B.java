package recap.spring_moderate_exercises.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//circular dependency - B object needs an A instance to exists at its creation time
@Component
public class B {
    @Autowired
    private A a;
}
