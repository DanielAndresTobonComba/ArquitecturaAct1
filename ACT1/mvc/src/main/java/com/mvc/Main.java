package com.mvc;

import com.mvc.Controller.UserController;
import com.mvc.Model.UserModel;
import com.mvc.View.UserView;

public class Main {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.start();
    }
}
