package com.wage.springcloud.controller;


import com.wage.springcloud.entities.User;
import com.wage.springcloud.service.UserService;

import java.security.Principal;

/**
 * @author wage
 * @version 1.0
 */

public class UserController {

    private UserService userService;

    public Principal getUser(Principal principal){
        return principal;
    }

    public void createUser(User user){
        userService.create(user);
    }
}
