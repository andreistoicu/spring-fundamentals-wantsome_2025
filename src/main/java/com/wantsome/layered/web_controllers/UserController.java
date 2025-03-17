package com.wantsome.layered.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.wantsome.layered.service.UserService;

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
}
