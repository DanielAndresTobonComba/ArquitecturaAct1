package com.hexagonal;


import com.hexagonal.Application.UserService;
import com.hexagonal.Infraestructure.ConsoleAdapter;
import com.hexagonal.Infraestructure.InMemoryUserRepository;

public class Main {
    public static void main(String[] args) {
        InMemoryUserRepository userRepository = new InMemoryUserRepository();
        UserService userService = new UserService(userRepository);
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(userService);

        consoleAdapter.start();
    }
}
