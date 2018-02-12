package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginmodel.isDatabaseConnection()) {
            this.dbStatus.setText("Connected to DB");
        } else {
            this.dbStatus.setText("Not Connected to DB");
        }


    }//initialize
}
