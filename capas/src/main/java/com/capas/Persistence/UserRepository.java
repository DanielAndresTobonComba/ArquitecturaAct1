package com.capas.Persistence;

import java.util.List;

import com.capas.Bussiness.User;

public interface UserRepository {
    void addUser(User user);
    List<User> getUsers();
    boolean deleteUser(int index);
}

