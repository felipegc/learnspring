package com.in28minutes.login;

import com.in28minutes.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    // @ResponseBody
    public String showLoginPage() {
        // when there is no ResponseBody annotation it sends direct to the page.
        // otherwise it sends to the view resolver(servlet). Look at the todo-servlet.xml
//        return "login2";
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (loginService.isUserValid(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "The user is not valid!");
        return "login";
    }
}
