package sample.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;
import sample.User;

import java.net.URL;
import java.util.ResourceBundle;



public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginField;

    @FXML
    private Button enterButton;

    @FXML
    private TextField nameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private PasswordField locationField;

    @FXML
    private CheckBox maleCheckBox;

    @FXML
    private CheckBox femaleCheckBox;

    @FXML
    void initialize() {
        enterButton.setOnAction(event -> {
            signUpNewUser();
        });
    }


    private void signUpNewUser() {
        String gender = maleCheckBox.isSelected() ? "Male" : "Female";
        String lastName = lastNameField.getText();
        String password = passwordField.getText();
        String location = locationField.getText();
        String login = loginField.getText();
        String name = nameField.getText();

        User user = new User(name, lastName, login, password, location, gender);
        DatabaseHandler databaseHandler = new DatabaseHandler();
        databaseHandler.signUpUser(user);
    }
}

