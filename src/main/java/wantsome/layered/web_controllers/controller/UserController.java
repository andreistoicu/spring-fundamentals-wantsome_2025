package wantsome.layered.web_controllers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wantsome.layered.service.UserService;

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
