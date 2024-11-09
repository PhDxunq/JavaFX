package com.example.lesson2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authenticate(username, password)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 320, 240);
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Handle login failure (e.g., show an error message)
        }
    }

    private boolean authenticate(String username, String password) {
        // Simple authentication logic (replace with real authentication)
        return "user".equals(username) && "pass".equals(password);
    }
}