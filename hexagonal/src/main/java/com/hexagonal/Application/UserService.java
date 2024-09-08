package com.hexagonal.Application;
import java.util.List;

import com.hexagonal.Domain.User;
import com.hexagonal.Domain.UserRepository;


public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String name, String email) {
        User user = new User(name, email);
        userRepository.addUser(user);
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public void deleteUser(int index) {
        userRepository.deleteUser(index);
    }
}

