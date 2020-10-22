package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

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
    void initialize() {
        assert imageButtonUser != null : "fx:id=\"imageButtonUser\" was not injected: check your FXML file 'app.fxml'.";

    }
}

