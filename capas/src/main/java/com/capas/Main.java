package com.capas;

import com.capas.Bussiness.UserService;
import com.capas.Persistence.InMemoryUserRepository;
import com.capas.Presentacion.ConsoleUI;

public class Main {
    public static void main(String[] args) {

        InMemoryUserRepository userRepository = new InMemoryUserRepository();
        UserService userService = new UserService(userRepository);
        ConsoleUI consoleUI = new ConsoleUI(userService);

        consoleUI.start();
    }
}