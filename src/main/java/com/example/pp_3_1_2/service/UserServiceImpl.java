package com.example.pp_3_1_2.service;

import com.example.pp_3_1_2.model.User;
import com.example.pp_3_1_2.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getListOfUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
