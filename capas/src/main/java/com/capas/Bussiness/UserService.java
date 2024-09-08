package com.capas.Bussiness;



import java.util.List;

import com.capas.Persistence.UserRepository;

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

    public boolean deleteUser(int index) {
        return userRepository.deleteUser(index);
    }
}

