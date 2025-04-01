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

    public UserLoginController(UserLoginRepository userLoginRepository, PasswordEncoder passwordEncoder) {
        this.userLoginRepository = userLoginRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserLogin());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserLogin userLogin) {
        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLogin.setRole("ROLE_USER");
        userLoginRepository.save(userLogin);
        return "redirect:/login";
    }
}
