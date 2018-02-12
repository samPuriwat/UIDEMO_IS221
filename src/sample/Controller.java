package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel loginmodel = new loginModel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (this.loginmodel.isDatabaseConnection()) {
            System.out.println("Test");
            this.dbStatus.setText("Connected to DB");
        } else {
            this.dbStatus.setText("Not Connected to DB");
        }


    }//initialize

    @FXML
    public void Login(ActionEvent event){
        System.out.println(this.username.getText());
        try {
            if (this.loginmodel.isLogin(this.username.getText(),
                    this.password.getText())) {
                Stage stage = (Stage) this.btnLogin.getScene().getWindow();
                stage.close();

                adminLogin();


            } else {
                JOptionPane.showMessageDialog(null, "Your username or " +
                        "password is not corrected.");
            }
        } catch (Exception localException) {
            localException.printStackTrace();
        }

    }//Login

    private void adminLogin() {
//        try {
//            Stage adminStage = new Stage();
//            FXMLLoader adminLoader = new FXMLLoader();
//            Pane adminRoot = (Pane)adminLoader.load(getClass().getResource("" +
//                    "/Admin/AdminDashBoard.fxml").openStream());
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        JOptionPane.showMessageDialog(null, "Welcome to Our System.");

    }


}
