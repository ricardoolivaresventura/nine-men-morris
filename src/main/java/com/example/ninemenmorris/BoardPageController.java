package com.example.ninemenmorris;

import classes.Game;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BoardPageController implements Initializable {
    @FXML
    Button btn1;
    @FXML
    Pane mainContainer;

    List<Button> buttonList = new ArrayList();
    List containerChildren = new ArrayList();

    String buttonStyle = "-fx-background-radius: 5em; " +
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px; " +
            "-fx-background-color: white;" +
            "-fx-background-insets: 0px; " +
            "-fx-padding: 0px;";

    public void setBtnStyle(Button btn){
        btn.setStyle(buttonStyle);
    }

    public void testButonClick(Button btn){
        btn.setOnAction(actionEvent -> {
            System.out.println(btn.getId());
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        containerChildren = mainContainer.getChildren();
        for(int i = 0; i < containerChildren.size(); i++){
            if(containerChildren.get(i) instanceof Button){
                setBtnStyle((Button) containerChildren.get(i));
                testButonClick((Button)containerChildren.get(i));
            }
        }
        // Game.showPlayers();
    }

}
