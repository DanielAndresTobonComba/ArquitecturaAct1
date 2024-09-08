package com.hexagonal.Infraestructure;


import java.util.ArrayList;
import java.util.List;

import com.hexagonal.Domain.User;
import com.hexagonal.Domain.UserRepository;



public class InMemoryUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users); // Devuelve una copia para evitar la mutación externa
    }

    @Override
    public void deleteUser(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }
}