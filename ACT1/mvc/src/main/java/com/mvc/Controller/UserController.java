package com.mvc.Controller;




import java.util.Scanner;

import com.mvc.Model.User;
import com.mvc.Model.UserModel;
import com.mvc.View.UserView;

public class UserController {

   private Scanner scanner = new Scanner(System.in);

    private UserModel model;
    private UserView view;

    

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void addUser() {
        User user = view.promptUserInfo();
        model.addUser(user);
    }

    public void viewUsers() {
        view.showUsers(model.getUsers());
    }

    public void deleteUser() {
        int index = view.promptDeleteUser(model.getUsers());
        model.deleteUser(index);
        viewUsers(); // Actualiza la lista después de eliminar
    }

    public void exit() {
        view.showExitMessage();
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
            scanner.nextLine();
            

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    viewUsers();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    exit();
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}

