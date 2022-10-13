package com.example.ninemenmorris;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class WindowTwoController implements Initializable {
    @FXML
    Button btn1;

    public void setBtnTitle(){
        btn1.setStyle(
                "-fx-background-radius: 5em; " +
                        "-fx-min-width: 30px; " +
                        "-fx-min-height: 30px; " +
                        "-fx-max-width: 30px; " +
                        "-fx-max-height: 30px; " +
                        "-fx-background-color: black;" +
                        "-fx-background-insets: 0px; " +
                        "-fx-padding: 0px;"
        );
        btn1.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setBtnTitle();
    }
}
