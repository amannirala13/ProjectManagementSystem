package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.auth.DBAuth;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        boolean success = DBAuth.createUser("Aman Nirala", "SDE", "IT");

        if(success)
            welcomeText.setText("User Created");
        else welcomeText.setText("Failed to create user");
    }
}