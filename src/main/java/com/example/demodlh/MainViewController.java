package com.example.demodlh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    @FXML
    public ToggleGroup genderGroup;
    @FXML
    public ToggleGroup foodGroup;
    @FXML
    public ToggleGroup hobbyGroup;


    private Stage stage;
    private Scene scene;
    private Parent root;


    private User userInfo () {
        User user = new User();
        RadioButton selectedRadioButton = (RadioButton) genderGroup.getSelectedToggle();
        user.gender = selectedRadioButton.getText();

        RadioButton selectedRadioButton2 = (RadioButton) foodGroup.getSelectedToggle();
        user.food = selectedRadioButton2.getText();

        RadioButton selectedRadioButton3 = (RadioButton) hobbyGroup.getSelectedToggle();
        user.hobby = selectedRadioButton3.getText();

        return user;
    }




    @FXML
    public void handleResultsButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("results-view.fxml"));
        root = loader.load();
        User newUser = userInfo();
        ResultsView resultsView = loader.getController();
        resultsView.displayResults(newUser);



        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    @FXML
    public void handleLogouButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();

    }
}
