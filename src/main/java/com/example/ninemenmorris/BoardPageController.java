package com.example.ninemenmorris;

import classes.Game;
import classes.GlobalConstants;
import classes.Mill;
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

    String hightlightStyle = "-fx-background-radius: 5em; " +
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px; " +
            "-fx-background-color: green;" +
            "-fx-background-insets: 0px; " +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 5em;" +
            "-fx-border-color: white;" +
            "-fx-padding: 0px;";

    public void setBtnStyle(Button btn){
        btn.setStyle(buttonStyle);
    }

    public void highlightButtonsToRemove(int row, int column){
        containerChildren = mainContainer.getChildren();
        for(int i = 0; i < containerChildren.size(); i++){
            if(containerChildren.get(i) instanceof Button){
                String btnText = ((Button) containerChildren.get(i)).getId();
                String rowAndColumn = btnText.substring(3, 5);
                int btnRow = Character.getNumericValue(rowAndColumn.charAt(0));
                int btnColumn = Character.getNumericValue(rowAndColumn.charAt(1));
                if(btnRow == row && btnColumn == column){
                    ((Button) containerChildren.get(i)).setStyle(hightlightStyle);
                }
            }
        }
    }

    public void loopFiles(char color){
        char currentBtnColor = ' ';
        for(int i=0; i < GlobalConstants.ROWS; i++){
            for(int j=0; j< GlobalConstants.COLUMN; j++){
                currentBtnColor = Game.board.getFileInPosition(i, j).getColor();
                if(currentBtnColor == color){
                    // Game.board.getFileInPosition(i,j).setHighlight(true);
                    highlightButtonsToRemove(i, j);
                }
            }
        }
    }
    public void highlightFilesToRemove(){
        if(Game.currentTurn == GlobalConstants.BLACK){
            loopFiles(GlobalConstants.RED);
        }
        else{
            loopFiles(GlobalConstants.BLACK);
        }
    }

    public void testButtonClick(Button btn){
        btn.setOnAction(actionEvent -> {
            if(Game.placedFilesQuantity < GlobalConstants.MAX_FILES_QUANTITY) {
                Boolean checkMill=false;
                String btnText = btn.getId();
                String rowAndColumn = btnText.substring(3, 5);
                int btnRow = Character.getNumericValue(rowAndColumn.charAt(0));
                int btnColumn = Character.getNumericValue(rowAndColumn.charAt(1));
                char currentBtnColor = Game.board.getFileInPosition(btnRow, btnColumn).getColor();

                if(currentBtnColor != GlobalConstants.BLACK && currentBtnColor != GlobalConstants.RED){
                    if(Game.currentTurn == GlobalConstants.BLACK){
                        btn.setStyle(blackStyle);
                    }
                    else {
                        btn.setStyle(redStyle);
                    }
                    if(Game.board.setFileInPosition(btnRow, btnColumn)){
                        Game.placedFilesQuantity = Game.placedFilesQuantity + 1;
                        checkMill = Mill.mill(Game.board.getFiles(), btnRow,btnColumn);
                        if(checkMill){
                            System.out.println("check milllll truee");
                            highlightFilesToRemove();
                        }
                        if ( Game.currentTurn== GlobalConstants.BLACK) {
                            Game.currentTurn=GlobalConstants.RED;
                        } else if(Game.currentTurn== GlobalConstants.RED) {
                            Game.currentTurn = GlobalConstants.BLACK;
                        }
                    }
                    /*
                     * ----------------CASO1--------------
                     * Si el turno actual es ROJO y se forma un molino,
                     * entonces se resaltará todas las fichas del jugador NEGRO
                     *
                     * Si el turno actual es NEGRO y se forma un molino,
                     * entonces se resaltará todas las fichas del jugador ROJO
                     * */
                }
            }
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
