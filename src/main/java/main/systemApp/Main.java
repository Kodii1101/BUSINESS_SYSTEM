//package
package main.systemApp;

//package local

//package external
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/login.fxml"));
        AnchorPane root = loader.load();

        // Set the scene
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.setTitle("Login Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
