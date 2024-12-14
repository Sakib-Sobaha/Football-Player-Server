package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import util.NetworkUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    private Stage stage;
    private NetworkUtil networkUtil;
    private static List<Player>sellPlayerList = new ArrayList<>();

    public Stage getStage(){
        return stage;
    }

    public NetworkUtil getNetworkUtil(){
        return networkUtil;
    }

    FileOperations players = new FileOperations();

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1280, 700));
        primaryStage.setResizable(false);
        primaryStage.show();*/
        stage = primaryStage;
        connectToServer();
        //showClubPage();
         showWelcomePage();
        //showLoginPage();
    }

    private void connectToServer() throws IOException {
        String serverAddress = "127.0.0.1";
        int serverPort = 33333;
        networkUtil = new NetworkUtil(serverAddress, serverPort);
        new ReadThread(this);

    }

    public List getSellPlayers(){
        return sellPlayerList;
    }

    public void showLoginPage() throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        //Loading the controller
        LoginController controller = loader.getController();
        controller.setMain(this);

        //Set the primary stage
        stage.setTitle("Login");
        stage.setScene(new Scene(root,1280,700));
        stage.show();
    }

    public void showWelcomePage() throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("welcome.fxml"));
        Parent root = loader.load();

        WelcomeController controller = loader.getController();
        controller.setMain(this);

        stage.setTitle("Welcome");
        stage.setScene(new Scene(root,1280,700));
        stage.show();
    }

    public void showClubPage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Clubs.fxml"));
        Parent root = loader.load();

        ClubsController controller = loader.getController();
        controller.setMain(this);

        stage.setTitle("Clubs");
        stage.setScene(new Scene(root,1280,700));
        stage.show();

    }

    public void showClubHomePage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClubHome.fxml"));
        Parent root = loader.load();

        ClubHomeController controller = loader.getController();
        controller.load();
        controller.setMain(this);

        stage.setTitle("ClubHome");
        stage.setScene(new Scene(root,1280,700));
        stage.show();
    }

    public void showCountryPlayerPage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CountryPlayer.fxml"));
        Parent root = loader.load();

        CountryPlayerController controller = loader.getController();
        controller.load();
        controller.setMain(this);

        stage.setTitle("Country wise players");
        stage.setScene(new Scene(root,767,649));
        stage.show();
    }

    public void showAuctionPage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SellList.fxml"));
        Parent root = loader.load();

        SellListController controller = loader.getController();
        controller.load();
        controller.setMain(this);

        stage.setTitle("Auction List");
        stage.setScene(new Scene(root,1280,700));
        stage.show();

    }

    public void showAlert(){
        Alert alert  = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect Credentials");
        alert.setHeaderText("Incorrect Credentials");
        alert.setContentText("The username and password you provided is wrong");
        alert.showAndWait();
    }

    public void showPlayerList() throws Exception {
        List<Player> playerList = new ArrayList();
        playerList = players.getplayerList();
        for(Player p : playerList){
            System.out.println(p);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}