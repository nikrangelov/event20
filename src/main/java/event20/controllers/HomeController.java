package event20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nik on 6/3/17.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "home";
    }

}