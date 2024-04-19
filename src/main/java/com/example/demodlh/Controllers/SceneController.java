package com.example.demodlh.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    public PasswordField passwordField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private GridPane gridPane;


    @FXML
    public void handleSubmitButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Main");
        stage.show();
    }


    public void handleSignUpButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Signup");
        stage.show();
    }
    @FXML
    public void handleOpenNewWindow() throws IOException{
        Stage newWindow = new Stage();
        newWindow.setTitle("New Window");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("new-window.fxml"));
        gridPane = loader.load();
        newWindow.show();
    }
}