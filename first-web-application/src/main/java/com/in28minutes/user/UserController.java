package com.in28minutes.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
//    @ResponseBody
    public String userRoot() {
        return "user";
    }
}
