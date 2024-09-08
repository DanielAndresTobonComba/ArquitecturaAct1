package com.hexagonal.Infraestructure;



import java.util.List;
import java.util.Scanner;

import com.hexagonal.Application.UserService;
import com.hexagonal.Domain.User;


public class ConsoleAdapter {
    private final UserService userService;
    private final Scanner scanner;

    public ConsoleAdapter(UserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Crear Usuario");
            System.out.println("2. Visualizar Todos los Usuarios");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea restante

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    viewUsers();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private void createUser() {
        System.out.print("Introduce el nombre del usuario: ");
        String name = scanner.nextLine();
        System.out.print("Introduce el correo electrónico del usuario: ");
        String email = scanner.nextLine();
        userService.addUser(name, email);
    }

    private void viewUsers() {
        List<User> users = userService.getUsers();
        if (users.isEmpty()) {
            System.out.println("No hay usuarios disponibles.");
        } else {
            System.out.println("Usuarios:");
            for (int i = 0; i < users.size(); i++) {
                System.out.println((i + 1) + ". " + users.get(i));
            }
        }
    }

    private void deleteUser() {
        viewUsers();
        System.out.print("Introduce el número del usuario que deseas eliminar: ");
        int index = scanner.nextInt() - 1;
        userService.deleteUser(index);
    }
}