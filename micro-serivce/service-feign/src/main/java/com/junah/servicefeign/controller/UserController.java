package com.junah.servicefeign.controller;

import com.junah.servicefeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public String getUserList() {
        return userService.getUserList();
    }
}
