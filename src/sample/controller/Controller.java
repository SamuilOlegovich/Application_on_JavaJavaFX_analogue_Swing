package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class Controller {

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
    private Button registerNowButton;

    @FXML
    void initialize() {

        enterButton.setOnAction(event -> {
            // при нажатии на кнопку мы прячем окно
            // мы берем сцену на которой она находится
            // потом берем окно на которой она находится
            // и дальше уже это окно уже прячем
            enterButton.getScene().getWindow().hide();
            // далее нам нужно отобразить следующее нужное нам окно
            FXMLLoader fxmlLoader = new FXMLLoader();
            // устанавливаем локацию файла который нам надо загрузить
            fxmlLoader.setLocation(getClass().getResource("/sample/view/signUp.fxml"));
            // а теперь запускаем его отображение
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent parent = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.showAndWait();

            System.out.println("Вы нажали на кнопку войти");
        });
    }
}
