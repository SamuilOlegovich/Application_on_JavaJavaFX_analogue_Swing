package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageButtonUser;

    @FXML
    private Button buttonExit;

    @FXML
    void initialize() {
        buttonExit.setOnAction(event -> {
            openNewScene("/sample/view/sample.fxml");
        });
    }

    private void openNewScene(String window) {
        // при нажатии на кнопку мы прячем окно
        // мы берем сцену на которой она находится
        // потом берем окно на которой она находится
        // и дальше уже это окно уже прячем
        buttonExit.getScene().getWindow().hide();
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
        stage.showAndWait();
    }
}


