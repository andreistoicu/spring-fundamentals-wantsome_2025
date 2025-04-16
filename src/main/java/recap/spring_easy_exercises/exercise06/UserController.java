package recap.spring_easy_exercises.exercise06;

import com.wantsome.layered.domain_dao.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        System.out.println(user);
        return ResponseEntity.ok("User: " + user.getName() + " created successfully");
    }
}
