package event20.controllers;

import event20.entities.User;
import event20.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nik on 5/30/17.
 */

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "Hello, everything is working ok!";
    }

    @RequestMapping("/registerUser")
    public String registerUser(){
        User defaultUser = new User("Ivan", "Ivanov", "ivan@ivanov.com");
        defaultUser.setPassword("1234");
        userService.saveUser(defaultUser);
        return "OK! User Registered";
    }
}
