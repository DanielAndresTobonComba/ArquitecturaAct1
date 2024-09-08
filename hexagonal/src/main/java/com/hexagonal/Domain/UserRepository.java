package com.hexagonal.Domain;


import java.util.List;

public interface UserRepository {
    void addUser(User user);
    List<User> getUsers();
    void deleteUser(int index);
}

