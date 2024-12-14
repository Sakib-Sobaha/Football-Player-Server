package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SellListController implements Initializable {

    private Main main;
    List <Player> buyPlayerList = new ArrayList();
    ClubHomeController obj = new ClubHomeController();

    @FXML
    private TextField buyPlayerText;

    @FXML
    private Button buyButton;

    @FXML
    private Button backButton;

    @FXML
    private Label labelPlayers;

    public void load(){
        buyPlayerList = obj.getSellPlayerList();
        System.out.println("In Buying.........");
            System.out.println(buyPlayerList);
            StringBuilder str = new StringBuilder();
            str.append("Players You Can Buy Now....");
            str.append("\n");
            for (Player p : buyPlayerList) {
                str.append(Player.toString(p.getName() + "\t\t" + p.getCountry() + "\t\t" + p.getAge() + "\t\t" + p.getHeight() + "\t\t" + p.getPosition() + "\t\t" + p.getNumber() + "\t" + p.getSalary()));
                str.append("\n");
            }
            labelPlayers.setText(str.toString());


    }

    @FXML
    void BuyPlayer(ActionEvent event) {



    }

    @FXML
    void backToClub(ActionEvent event) {
        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    void setMain(Main main){
        this.main = main;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        load();

    }
}
