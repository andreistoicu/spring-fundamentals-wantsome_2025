package com.wantsome.layered.web_controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class GreetingsController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Thymeleaf is the best");
        model.addAttribute("items", List.of("Item1", "Item2", "Item3", "Item4", "Item5"));
        return "greeting";
    }
}
