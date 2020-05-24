package cuit.shop.controller;


import cuit.shop.entity.User;
import cuit.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list_user")
    public List<User> UserList() {
        return userService.UserList();
    }
}