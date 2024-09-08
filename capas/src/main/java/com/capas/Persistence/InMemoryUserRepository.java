package com.capas.Persistence;



import java.util.ArrayList;
import java.util.List;

import com.capas.Bussiness.User;


public class InMemoryUserRepository implements UserRepository {
    
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public boolean deleteUser(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
            return true;
        }
        return false;
    }

}

