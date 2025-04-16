package recap.spring_easy_exercises.exercise01;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private Object repository;

    public MyService(Object repository) {
        this.repository = repository;
    }

    public String greet() {
        return "Hello Wantsome!";
    }
}
