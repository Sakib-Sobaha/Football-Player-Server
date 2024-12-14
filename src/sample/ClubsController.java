package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import util.LoginDTO;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ClubsController implements Initializable {

    private Main main;
    static boolean ManUpressed = true;
    static boolean ManCpressed = true;
    static boolean LiverPpressed = true;
    static boolean Arsenalpressed = true;
    static boolean Chelseapressed = true;

    @FXML
    private ImageView ManUnitedImage;

    @FXML
    private ImageView ManCityImage;

    @FXML
    private ImageView ChelseaImage;

    @FXML
    private ImageView LiverPoolImage;

    @FXML
    private ImageView ArsenalImage;

    @FXML
    private Button Manunited;

    @FXML
    private Button Mancity;

    @FXML
    private Button ChelSea;

    @FXML
    private Button Liverpool;

    @FXML
    private Button ArsenalButton;

    @FXML
    void loginArsenal(ActionEvent event) {
       Arsenalpressed = true;
       ManUpressed = false;
       ManCpressed = false;
       Chelseapressed = false;
       LiverPpressed = false;
       try{
           main.showClubHomePage();
       }catch(Exception e){
           e.printStackTrace();
       }

    }

    @FXML
    void loginChelsea(ActionEvent event) {
        Chelseapressed  = true;
        Arsenalpressed = false;
        ManUpressed = false;
        ManCpressed = false;
        LiverPpressed = false;
        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void loginLiverpool(ActionEvent event) {
        LiverPpressed = true;
        Chelseapressed  = false;
        Arsenalpressed = false;
        ManUpressed = false;
        ManCpressed = false;
        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void loginManCity(ActionEvent event) {
        ManCpressed = true;
        LiverPpressed = false;
        Chelseapressed  = false;
        Arsenalpressed = false;
        ManUpressed = false;

        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void loginManU(ActionEvent event) {
        ManUpressed = true;
        ManCpressed = false;
        LiverPpressed = false;
        Chelseapressed  = false;
        Arsenalpressed = false;

        try{
            main.showClubHomePage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void init(){
        Image manUimg = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/ManchesterUnited.png")));
        ManUnitedImage.setImage(manUimg);

        Image manCityimg = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/ManchesterCity.jpg")));
        ManCityImage.setImage(manCityimg);

        Image chelseaimg = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/Chelsea.jpg")));
        ChelseaImage.setImage(chelseaimg);

        Image liverimg = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/Liverpool.jpg")));
        LiverPoolImage.setImage(liverimg);

        Image arsenimg = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/Arsenal.jpeg")));
        ArsenalImage.setImage(arsenimg);




    }
    public boolean isArsenalpressed(){
        return Arsenalpressed;
    }

    public boolean isManUpressed(){
        return ManUpressed;
    }

    public boolean isManCpressed(){
        return ManCpressed;
    }

    public boolean isLiverPpressed(){
        return LiverPpressed;
    }

    public boolean isChelseapressed(){
        return Chelseapressed;
    }

    void setMain(Main main){
        this.main = main;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

