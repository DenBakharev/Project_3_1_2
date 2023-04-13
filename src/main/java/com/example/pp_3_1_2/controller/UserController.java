package com.example.pp_3_1_2.controller;

import com.example.pp_3_1_2.model.User;
import com.example.pp_3_1_2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = userService.getListOfUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/create")
    public String createUserForm(User user){
        return "create";
    }

    @PostMapping("/create")
    public String createUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update";
    }

    @PostMapping("/update")
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}

