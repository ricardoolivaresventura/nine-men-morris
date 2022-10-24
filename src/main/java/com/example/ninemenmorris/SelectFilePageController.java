package com.example.ninemenmorris;

import classes.Game;
import classes.GlobalConstants;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectFilePageController {
    @FXML
    Button blackButton;
    @FXML
    Button redButton;

    public void navigateToNextWindow(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BoardPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root,912,649);
        Stage stage = new Stage();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/Logo.png")));
        stage.setScene(scene);
        stage.setTitle("Nime Men's Morris");
        stage.show();
        stage.setResizable(false);
        Stage myStage = (Stage) this.blackButton.getScene().getWindow();
        myStage.close();
    }

    public void selectBlackBtn(ActionEvent actionEvent) throws IOException {
        Game.setPlayer1(GlobalConstants.BLACK);
        Game.setPlayer2(GlobalConstants.RED);
        Game.currentTurn = GlobalConstants.BLACK;
        navigateToNextWindow(actionEvent);
    }

    public void selectRedBtn(ActionEvent actionEvent) throws IOException{
        Game.setPlayer1(GlobalConstants.RED);
        Game.setPlayer2(GlobalConstants.BLACK);
        Game.currentTurn = GlobalConstants.RED;
        navigateToNextWindow(actionEvent);
    }

}
