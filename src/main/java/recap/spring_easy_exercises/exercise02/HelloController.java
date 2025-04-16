package recap.spring_easy_exercises.exercise02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping("/world")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/salutation")
    public String hello(@RequestParam String name) {
        return name != null
        ? "Hello " + name
        : "Hello stranger";
    }
}
