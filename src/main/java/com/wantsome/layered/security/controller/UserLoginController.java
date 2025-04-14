package com.wantsome.layered.security.controller;

import com.wantsome.layered.security.model.UserLogin;
import com.wantsome.layered.security.repository.UserLoginRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    private final UserLoginRepository userLoginRepository;
    private final PasswordEncoder passwordEncoder;

    private static final String USER_ROLE = "ROLE_USER";

    public UserLoginController(UserLoginRepository userLoginRepository, PasswordEncoder passwordEncoder) {
        this.userLoginRepository = userLoginRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserLogin());
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "loginPage";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserLogin userLogin) {
        if (userLogin.getUsername().isEmpty() || userLogin.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Username or password cannot be empty");
        }

        UserLogin existUserLogin = userLoginRepository.findByUsername(userLogin.getUsername());
        if (existUserLogin != null) {
            throw new IllegalArgumentException("Username " + userLogin.getUsername() + " already exists");
        }
        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLogin.setRole(USER_ROLE);
        userLoginRepository.save(userLogin);
        return "redirect:/login";
    }
}
