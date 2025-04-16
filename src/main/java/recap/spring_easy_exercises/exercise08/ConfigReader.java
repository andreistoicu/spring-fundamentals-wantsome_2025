package recap.spring_easy_exercises.exercise08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigReader {
    @Value("${app.unknown:default}") //app.config nu este definit in application.properties, veti primi eroare la startup.
    private String value;
}
