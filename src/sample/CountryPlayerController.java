package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CountryPlayerController implements Initializable {
    @FXML
    private Label CountLabel;

    @FXML
    private Button backButton;

    private Main main;
    FileOperations players1 = new FileOperations();
    List<Country>countryList= new ArrayList<>();
    List<Player>playerList = new ArrayList<>();






    void setMain(Main main){
        this.main = main;
    }

    public void load() throws Exception {
        int playercount;
        playerList = players1.getplayerList();

        StringBuilder playerInfo = new StringBuilder();
        playerInfo.append("Country"+"\t\t\t\t\t"+"PlayerNumbers");
        playerInfo.append("\n");
        for(Player p : playerList){
            Country c = new Country(p.getCountry());
            countryList.add(c);
        }
        for(int i=0; i<countryList.size()-1; ++i){
            for(int j=i+1; j<countryList.size(); ++j){
                if(countryList.get(i).getCountryName().equals(countryList.get(j).getCountryName())){
                    countryList.remove(j);
                }
            }
        }

        for (Country c : countryList) {
            playercount = 0;
            for (Player p : playerList) {
                if (p.getCountry().equals(c.getCountryName())) {
                    playercount++;
                }
            }
            playerInfo.append(c.getCountryName()+"\t\t\t\t"+playercount);
            playerInfo.append("\n");
            //System.out.println("Number of players in country " + c.getCountryName() + " : " + playercount);
        }

        CountLabel.setText(playerInfo.toString());

    }

    @FXML
    void BacktoHome(ActionEvent event) {
        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
