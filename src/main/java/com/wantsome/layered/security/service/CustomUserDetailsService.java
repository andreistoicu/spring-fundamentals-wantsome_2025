package com.wantsome.layered.security.service;


import com.wantsome.layered.security.model.UserLogin;
import com.wantsome.layered.security.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.List.*;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserLoginRepository userLoginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLogin userLogin = userLoginRepository.findByUsername(username);
        if (userLogin == null) {
            throw new UsernameNotFoundException("Username: " + username + " was not found in database");
        }
        return new User(userLogin.getUsername(),
                userLogin.getPassword(),
                of(new SimpleGrantedAuthority(userLogin.getRole())));
    }
}
