package event20.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nik on 5/30/17.
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "Hello, everything is working ok!";
    }
}
