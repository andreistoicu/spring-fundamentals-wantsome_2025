package recap.spring_easy_exercises.exercise04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import recap.spring_easy_exercises.exercise01.MyService;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService(new Object());
    }
}
