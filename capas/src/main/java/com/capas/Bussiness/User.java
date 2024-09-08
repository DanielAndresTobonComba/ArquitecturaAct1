package com.capas.Bussiness;



public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Email: " + email;
    }
}
