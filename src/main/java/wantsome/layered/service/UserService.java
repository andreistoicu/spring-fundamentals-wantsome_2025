package wantsome.layered.service;

import org.springframework.stereotype.Service;
import wantsome.layered.domain_dao.User;
import wantsome.layered.domain_dao.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }
}
