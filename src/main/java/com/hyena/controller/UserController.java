package com.hyena.controller;


import com.hyena.model.User;
import com.hyena.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public void insertUser(User user) {
        userService.insertUser(user);
    }

    @RequestMapping("/delete")
    public void deleteUser(Long param) {
        userService.deleteUser(param);
    }

    @RequestMapping("/update")
    public void updateUser(String username, int id) {
        userService.updateUser(username, id);
    }

    @RequestMapping("/select")
    public List<User> selectUser(Long id ) {
        return userService.selectUser(id);
    }

}
