package com.example.ninemenmorris;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WindowOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 912, 649);
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/Logo.png")));
        stage.setTitle("Nime Men's Morris!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}