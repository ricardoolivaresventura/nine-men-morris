package com.example.ninemenmorris;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MillPageController implements Initializable {
    @FXML
    Pane millPane;
    @FXML
    Button btn;
    public void toCall(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MillPage.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene = new Scene(root,200,100);
        Stage stage = new Stage();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/Logo.png")));
        stage.setScene(scene);
        stage.setTitle("Nime Men's Morris");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    public void close(ActionEvent actionEvent){
        Stage myStage = (Stage) this.btn.getScene().getWindow();
        myStage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
