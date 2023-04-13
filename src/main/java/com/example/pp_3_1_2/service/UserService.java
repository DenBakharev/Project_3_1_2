package com.example.pp_3_1_2.service;

import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User getUserById(long id);

    List<User> getListOfUsers();

    void deleteUserById(Long id);
}

