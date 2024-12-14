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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

@SuppressWarnings("unused")
public class WelcomeController implements Initializable {

    private Main main;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

//    String path = "Files\\Waving_Flag.wav";
//    Media media = new Media(new File(path).toURI().toString());
//    MediaPlayer mediaPlayer = new MediaPlayer(media);

    @FXML
    private ImageView image;

    @FXML
    private Button Submit;

    @FXML
    private Button soundButton;


    @FXML
    public void playSound(ActionEvent event) {

        mediaPlayer.play();
        mediaPlayer.setVolume(.1);


    }


    public void init(){
        Image img = new Image (Objects.requireNonNull(Main.class.getResourceAsStream("/Files/ucl.jpg")));
        image.setImage(img);
    }

    @FXML
    void submit(ActionEvent event) {
        try{
            main.showLoginPage();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void setMain(Main main) {
        this.main = main;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP3\\src\\Files\\Waving_Flag.wav");
        media = new Media(file.toURI().toString());
        mediaPlayer= new MediaPlayer(media);


    }
}
