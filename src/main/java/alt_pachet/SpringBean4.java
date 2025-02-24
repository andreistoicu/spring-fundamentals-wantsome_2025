package alt_pachet;

import org.springframework.stereotype.Repository;

//nu va fi scanat de component-scan pentru este alt pachet
//@Repository //->adnotarea se foloseste doar daca nu utilizam xml configuration
public class SpringBean4 {

    public SpringBean4() {
        System.out.println("SpringBean4 constructor");
    }
}
