package recap.spring_easy_exercises.exercise09;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
