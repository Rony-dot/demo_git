package bd.edu.seu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.net.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private TextField userNameField;

    @FXML
    private TextField passwordField;

    String DB_URL = "jdbc:mysql://localhost:3306/bankdb";
    String DB_USER = "root";
    String DB_PASS= "rony123456";
    String query  ;
    Connection con;

    String userName;
    String password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    @FXML
    void handleLogInAction(ActionEvent event) {
        userName = userNameField.getText();
        password = passwordField.getText();

    }
    @FXML
    void handleCreateAccountAction(ActionEvent event) {

    }



}
