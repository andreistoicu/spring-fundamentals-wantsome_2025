package com.wantsome.layered.web_controllers;

import com.wantsome.layered.domain_dao.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import com.wantsome.layered.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userList")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "userList";
    }

    @GetMapping("/userForm")
    public String submitUser(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/submitUser")
    public String submitUser(@Valid @ModelAttribute User user,
                             BindingResult bindingResult,
                             Model model) {

        if (bindingResult.hasErrors()) {
            return "userForm";
        }

        model.addAttribute("user", user);

        userService.saveUser(user);
        return "result";
    }
}
