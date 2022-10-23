package com.example.ninemenmorris;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class WelcomePageController {
    @FXML
    Button buttonStart;

    //this method will open BoardPage.fxml and then close WelcomePage.fxml
    public void nextWindow(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectFilePage.fxml"));
        Parent root = loader.load();

        SelectFilePageController controller = loader.getController();

        Scene scene = new Scene(root,912,649);
        Stage stage = new Stage();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/Logo.png")));
        stage.setScene(scene);
        stage.setTitle("Nime Men's Morris");
        stage.show();
        stage.setResizable(false);

        //close this window
        Stage myStage = (Stage) this.buttonStart.getScene().getWindow();
        myStage.close();
    }

}
