package com.mvc.Model;


import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private List<User> users;

    public UserModel() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void deleteUser(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }
}
