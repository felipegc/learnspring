package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean isUserValid(String user, String password) {
        if(user.equals("in20minutes") && password.equals("dummy")) {
            return true;
        }
        return false;
    }
}
