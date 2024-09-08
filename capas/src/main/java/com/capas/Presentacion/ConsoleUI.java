package com.capas.Presentacion;

import java.util.Scanner;

import com.capas.Bussiness.UserService;

public class ConsoleUI {

    private final UserService userService;
    private final Scanner scanner;

    public ConsoleUI(UserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Crear usuario");
            System.out.println("2. Visualizar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

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
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void createUser() {
        System.out.println("Ingrese el nombre:");
        String name = scanner.nextLine();
        System.out.println("Ingrese el email:");
        String email = scanner.nextLine();
        userService.addUser(name, email);
        System.out.println("Usuario creado exitosamente.");
    }

    private void viewUsers() {
        var users = userService.getUsers();
        if (users.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(i + 1 + ". " + users.get(i));
            }
        }
    }

    private void deleteUser() {
        System.out.println("Ingrese el número del usuario a eliminar:");
        int index = scanner.nextInt() - 1;
        if (userService.deleteUser(index)) {
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
