package recap.spring_easy_exercises.exercise03;

import com.wantsome.layered.domain_dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findAllByEmail(String email);

    @Query("SELECT USERS.username FROM USERS WHERE USERS.username LIKE '%@google.com'")
    public List<User> findByEmailFromGoogle();
}
