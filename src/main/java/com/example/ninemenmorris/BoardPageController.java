package com.example.ninemenmorris;

import classes.Game;
import classes.GlobalConstants;
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
    Pane mainContainer;

    List containerChildren = new ArrayList();

    String buttonStyle = "-fx-background-radius: 5em; " +
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px; " +
            "-fx-background-color: white;" +
            "-fx-background-insets: 0px; " +
            "-fx-padding: 0px;";

    String blackStyle = "-fx-background-radius: 5em; " +
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px; " +
            "-fx-background-color: black;" +
            "-fx-background-insets: 0px; " +
            "-fx-padding: 0px;";

    String redStyle = "-fx-background-radius: 5em; " +
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px; " +
            "-fx-background-color: red;" +
            "-fx-background-insets: 0px; " +
            "-fx-padding: 0px;";

    public void setBtnStyle(Button btn){
        btn.setStyle(buttonStyle);
    }

    public void testButtonClick(Button btn){
        btn.setOnAction(actionEvent -> {
            if(Game.currentTurn == GlobalConstants.BLACK){
                btn.setStyle(blackStyle);
            }
            else{
                btn.setStyle(redStyle);
            }
            String btnText = btn.getId();
            String rowAndColumn = btnText.substring(3, 5);
            int btnRow = Character.getNumericValue(rowAndColumn.charAt(0));
            int btnColumn = Character.getNumericValue(rowAndColumn.charAt(1));
            Game.board.setFileInPosition(btnRow, btnColumn);
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        containerChildren = mainContainer.getChildren();
        for(int i = 0; i < containerChildren.size(); i++){
            if(containerChildren.get(i) instanceof Button){
                ((Button) containerChildren.get(i)).setText("");
                setBtnStyle((Button) containerChildren.get(i));
                testButtonClick((Button)containerChildren.get(i));
            }
        }
        // Game.showPlayers();
    }

}
