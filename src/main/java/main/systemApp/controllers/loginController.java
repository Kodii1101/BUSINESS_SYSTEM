package main.systemApp.controllers;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    // This will be triggered when the login button is clicked
    @FXML
    private void handleLoginAction() {
        String username = usernameField.getText();
        char[] password = passwordField.getText().toCharArray();

        Argon2 argon2 = Argon2Factory.create();
        String hash = argon2.hash(10, 65536, 1, password);
        String hashVerify;
        hashVerify = hash;
        System.out.println("Hashed Password: " + hash + " Verify Hashed Password: " + hashVerify);
        System.out.println(hash.equals(hashVerify));

        if (username != null && !username.trim().isEmpty() || password != null) {
            if ("admin".equals(username) && hash.equals(hashVerify)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid credentials.");
                }
        } else {
            System.out.println("EMPTY FIELDS!");
        }

    }
}