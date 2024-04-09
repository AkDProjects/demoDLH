package com.example.demodlh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupView {

    private Stage stage;
    private Scene scene;


    @FXML
    public void handleSubmitButtonAction(ActionEvent event) throws IOException {
        Object root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.setTitle("Main");
        stage.show();
    }

    public void handleLoginButtonAction(ActionEvent event) throws IOException {
        Object root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
}
