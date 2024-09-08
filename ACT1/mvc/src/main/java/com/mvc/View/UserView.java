package com.mvc.View;


import java.util.List;
import java.util.Scanner;

import com.mvc.Model.User;

public class UserView {
    private Scanner scanner = new Scanner(System.in);

/*     private Scanner scanner;

    public void getScanner() {
        scanner = new Scanner(System.in);
    } */

    public void showUsers(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("No hay usuarios disponibles.");
        } else {
            System.out.println("Usuarios:");
            for (int i = 0; i < users.size(); i++) {
                System.out.println((i + 1) + ". " + users.get(i));
            }
        }
    }

    public User promptUserInfo() {
        System.out.print("Introduce el nombre del usuario: ");
        String name = scanner.nextLine();
        System.out.print("Introduce el correo electrónico del usuario: ");
        String email = scanner.nextLine();
        return new User(name, email);
    }

    public int promptDeleteUser(List<User> users) {
        showUsers(users);
        System.out.print("Introduce el número del usuario que deseas eliminar: ");
        return scanner.nextInt() - 1;
    }

    public void showExitMessage() {
        System.out.println("Saliendo del programa...");
    }
}

