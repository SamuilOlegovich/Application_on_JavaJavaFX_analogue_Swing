package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseHandler;
import sample.User;

import java.io.IOException;
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
    private CheckBox maleCheckBox;

    @FXML
    private CheckBox femaleCheckBox;

    @FXML
    private TextField locationField;


    @FXML
    void initialize() {
        enterButton.setOnAction(event -> {
            signUpNewUser();
            openNewScene("/sample/view/sampleTwo.fxml");
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


    private void openNewScene(String window) {
        // при нажатии на кнопку мы прячем окно
        // мы берем сцену на которой она находится
        // потом берем окно на которой она находится
        // и дальше уже это окно уже прячем
        enterButton.getScene().getWindow().hide();
        // далее нам нужно отобразить следующее нужное нам окно
        FXMLLoader fxmlLoader = new FXMLLoader();
        // устанавливаем локацию файла который нам надо загрузить
        fxmlLoader.setLocation(getClass().getResource(window));
        // а теперь запускаем его отображение
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = fxmlLoader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
//        stage.showAndWait();
        stage.show();
    }
}

