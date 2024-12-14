package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import util.LoginDTO;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Main main;

    @FXML
    private TextField userName;

    @FXML
    private TextField passWord;

    @FXML
    private Button next;


    @FXML
    private Button backButton;

    @FXML
    void back(ActionEvent event) {
        String username = userName.getText();
        String password = passWord.getText();
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUserName(username);
        loginDTO.setPassword(password);
        try{
            main.getNetworkUtil().write(loginDTO);
            main.showWelcomePage();
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void nextAction(ActionEvent event) throws Exception {
        /*userName.setText(null);
        passWord.setText(null);*/
        //main.showWelcomePage();
        //main.showPlayerList();
        try{
            main.showClubPage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    /*public void submit(ActionEvent actionEvent) {
    }*/

    void setMain(Main main){
        this.main = main;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
