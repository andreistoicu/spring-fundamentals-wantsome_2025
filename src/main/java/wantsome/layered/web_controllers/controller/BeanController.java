package wantsome.layered.web_controllers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BeanController {

    //@RequestMapping(method = RequestMethod.GET, value ="/users" ) //-> metoda utilizata in paralel, echivalent cu metoda de jos
    @GetMapping("/users")
    public String getUsers() {
        return "users";
    }

    //@RequestMapping(method = RequestMethod.POST, value= "/submitForm")
    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("name") String name , @RequestParam("email") String email) {
        System.out.println("Name: " + name);
        System.out.println("Email:" + email);
        return "success";
    }

}
