package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
//        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'sample.fxml'.";
//        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'sample.fxml'.";
//        assert enterButton != null : "fx:id=\"enterButton\" was not injected: check your FXML file 'sample.fxml'.";
//        assert registerNowButton != null : "fx:id=\"registerNowButton\" was not injected: check your FXML file 'sample.fxml'.";

        enterButton.setOnAction(event -> {
            System.out.println("Вы нажали на кнопку войти");
        });
    }
}
