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

public class ClubHomeController implements Initializable{

    private Main main;


    @FXML
    private VBox vBoxCode;

    @FXML
    private Label labelText;

    @FXML
    private Button BackClub;


    @FXML
    private Label playerInfo;

    @FXML
    private ComboBox comboBox;

    @FXML
    private TextField playerSearch;

    @FXML
    private Button searchButton;

    @FXML
    private TextField positionText;

    @FXML
    private Button posButton;

    @FXML
    private TextField salaryText;

    @FXML
    private Button salaryButton;

    @FXML
    private ImageView playerImage;

    @FXML
    private Button show;


    @FXML
    private TextField sellPlayerText;

    @FXML
    private Button sellButton;

    @FXML
    private Button nextPage;










    //ObservableList<Player> data;
    ClubList clubList = new ClubList();
    List<Club>clubs = new ArrayList<>();


    private boolean init = true;
    private static boolean isSearched = true;
    private static boolean isSold = true;


    ClubsController check = new ClubsController();

    FileOperations players = new FileOperations();
    List<Player>playerList = new ArrayList<>();
    List<Player>clubPlayers = new ArrayList<>();
    List<Player>sellPlayers = new ArrayList();
    private String playerName;
    private String path;

    void setMain(Main main){
        this.main = main;
    }

    public void init(){


    }


    public void load() throws Exception {

        ObservableList<Player>data = FXCollections.observableArrayList();
        playerList = players.getplayerList();
        //System.out.println(playerList);
        clubList = new ClubList(playerList);
        clubs = clubList.getclubs();
        for(Club c : clubs){
            System.out.println(c.getclubName());
        }


        if(check.isArsenalpressed()) {
            System.out.println("In Arsenal");
            labelText.setText("Arsenal");
            Club c1 = new Club();
            for(Club c: clubs ){
                if(c.getclubName().equals("Arsenal")){
                    c1 = c;
                    System.out.println(c1.getclubName());
                    break;
                }
            }

            clubPlayers = c1.clubPlayerList(c1,playerList);
            /*Player p1 = playerList.get(24);
            c1.removePlayer(p1);*/
            clubPlayers = c1.getUpdatedPlayers();
            //System.out.println(clubPlayers);
            //playerInfo.setText(String.valueOf(clubPlayers));
            StringBuilder arsenalinfo = new StringBuilder();
            arsenalinfo.append("Name"+"\t\t\t"+"Country"+"\t\t"+"Age"+"\t"+"Height"+"\t"+"Position"+"\t"+"Number"+"\t"+"Salary");
            arsenalinfo.append("\n");
            for(Player p : clubPlayers){

                arsenalinfo.append(Player.toString(p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getAge()+"\t"+p.getHeight()+"\t"+p.getPosition()+"\t"+p.getNumber()+"\t"+p.getSalary()));
                arsenalinfo.append("\n");

            }
            playerInfo.setText(arsenalinfo.toString());

            System.out.println("Beneath datatable");
        }

        else if(check.isManUpressed()){
            /*System.out.println(check.isArsenalpressed());
            System.out.println(check.isManUpressed());
            System.out.println(check.isManCpressed());
            System.out.println(check.isChelseapressed());
            System.out.println(check.isLiverPpressed());*/

            System.out.println("In ManchesterUnited");

            StringBuilder clubName = new StringBuilder();
            clubName.append("Manchester"+"\n"+"United");
            labelText.setText(clubName.toString());
            Club c2 = new Club();
            for(Club c: clubs ){
                if(c.getclubName().equals("Manchester United")){
                    c2 = c;
                    System.out.println(c2.getclubName());
                    break;
                }
            }

            clubPlayers = c2.getclubPlayerList(c2,playerList);
            //System.out.println(clubPlayers);
            //playerInfo.setText(String.valueOf(clubPlayers));
            StringBuilder manuinfo = new StringBuilder();
            manuinfo.append("Name"+"\t\t\t"+"Country"+"\t\t"+"Age"+"\t"+"Height"+"\t"+"Position"+"\t"+"Number"+"\t"+"Salary");
            manuinfo.append("\n");
            for(Player p : clubPlayers){

                manuinfo.append(Player.toString(p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getAge()+"\t"+p.getHeight()+"\t"+p.getPosition()+"\t"+p.getNumber()+"\t"+p.getSalary()));
                manuinfo.append("\n");

            }
            playerInfo.setText(manuinfo.toString());

            //System.out.println(data);
            System.out.println("Beneath datatable");

        }

        else if (check.isManCpressed()){
            /*System.out.println(check.isArsenalpressed());
            System.out.println(check.isManUpressed());
            System.out.println(check.isManCpressed());
            System.out.println(check.isChelseapressed());
            System.out.println(check.isLiverPpressed());*/
            System.out.println("In ManchesterCity");
            StringBuilder clubName3 = new StringBuilder();
            clubName3.append("Manchester"+"\n"+"City");
            labelText.setText(clubName3.toString());
            Club c3 = new Club();
            for(Club c: clubs ){
                if(c.getclubName().equals("Manchester City")){
                    c3 = c;
                    System.out.println(c3.getclubName());
                    break;
                }
            }

            clubPlayers = c3.getclubPlayerList(c3,playerList);
            //System.out.println(clubPlayers);
            //playerInfo.setText(String.valueOf(clubPlayers));
            StringBuilder mancinfo = new StringBuilder();
            mancinfo.append("Name"+"\t\t\t"+"Country"+"\t\t"+"Age"+"\t"+"Height"+"\t"+"Position"+"\t"+"Number"+"\t"+"Salary");
            mancinfo.append("\n");
            for(Player p : clubPlayers){

                mancinfo.append(Player.toString(p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getAge()+"\t"+p.getHeight()+"\t"+p.getPosition()+"\t"+p.getNumber()+"\t"+p.getSalary()));
                mancinfo.append("\n");

            }
            playerInfo.setText(mancinfo.toString());

            //System.out.println(data);
            System.out.println("Beneath datatable");


        }

        else if(check.isChelseapressed()){
            /*System.out.println(check.isArsenalpressed());
            System.out.println(check.isManUpressed());
            System.out.println(check.isManCpressed());
            System.out.println(check.isChelseapressed());
            System.out.println(check.isLiverPpressed());*/

            System.out.println("In Chelsea");
            StringBuilder clubName4 = new StringBuilder();
            clubName4.append("Chelsea"+"\n"+"Club");
            labelText.setText(clubName4.toString());
            Club c4 = new Club();
            for(Club c: clubs ){
                if(c.getclubName().equals("Chelsea")){
                    c4 = c;
                    System.out.println(c4.getclubName());
                    break;
                }
            }

            clubPlayers = c4.getclubPlayerList(c4,playerList);
            //System.out.println(clubPlayers);
            //playerInfo.setText(String.valueOf(clubPlayers));
            StringBuilder chelinfo = new StringBuilder();
            chelinfo.append("Name"+"\t\t\t"+"Country"+"\t\t"+"Age"+"\t"+"Height"+"\t"+"Position"+"\t"+"Number"+"\t"+"Salary");
            chelinfo.append("\n");
            for(Player p : clubPlayers){

                chelinfo.append(Player.toString(p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getAge()+"\t"+p.getHeight()+"\t"+p.getPosition()+"\t"+p.getNumber()+"\t"+p.getSalary()));
                chelinfo.append("\n");

            }
            playerInfo.setText(chelinfo.toString());

            //System.out.println(data);
            System.out.println("Beneath datatable");

        }

        else if(check.isLiverPpressed()){
            /*System.out.println(check.isArsenalpressed());
            System.out.println(check.isManUpressed());
            System.out.println(check.isManCpressed());
            System.out.println(check.isChelseapressed());
            System.out.println(check.isLiverPpressed());*/

            System.out.println("In Liverpool");
            StringBuilder clubName5 = new StringBuilder();
            clubName5.append("Liverpool"+"\n"+"Club");
            labelText.setText(clubName5.toString());
            Club c5 = new Club();
            for(Club c: clubs ){
                if(c.getclubName().equals("Liverpool")){
                    c5 = c;
                    System.out.println(c5.getclubName());
                    break;
                }
            }

            clubPlayers = c5.getclubPlayerList(c5,playerList);
            //System.out.println(clubPlayers);
            //playerInfo.setText(String.valueOf(clubPlayers));
            StringBuilder liverinfo = new StringBuilder();
            liverinfo.append("Name"+"\t\t\t"+"Country"+"\t\t"+"Age"+"\t"+"Height"+"\t"+"Position"+"\t"+"Number"+"\t"+"Salary");
            liverinfo.append("\n");
            for(Player p : clubPlayers){

                liverinfo.append(Player.toString(p.getName()+"\t\t"+p.getCountry()+"\t\t"+p.getAge()+"\t"+p.getHeight()+"\t"+p.getPosition()+"\t"+p.getNumber()+"\t"+p.getSalary()));
                liverinfo.append("\n");

            }
            playerInfo.setText(liverinfo.toString());

            //System.out.println(data);
            System.out.println("Beneath datatable");


        }

        System.out.println("Accessed in");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList searchList = FXCollections.observableArrayList("MaximumSalary","MaximumAge","MaximumHeight","YearlySalary");
        comboBox.setItems(searchList);


    }

    public void BacktoHome(ActionEvent actionEvent) {
        try{
            main.showClubPage();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void countryPlayers(ActionEvent actionEvent) {
        try{
            main.showCountryPlayerPage();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void Select(ActionEvent event) throws Exception {
        String s = comboBox.getSelectionModel().getSelectedItem().toString();
        playerList = players.getplayerList();
        clubList = new ClubList(playerList);
        clubs = clubList.getclubs();
        double yearlySalary = 0;
        Player p1 = new Player();

        if(check.isArsenalpressed()){
            StringBuilder sb = new StringBuilder();
            Club arC = new Club();
            for(Club c: clubs){
                if(c.getclubName().equals("Arsenal")){
                    arC = c;
                }
            }
            clubPlayers = arC.clubPlayerList(arC,playerList);

            //System.out.println(clubPlayers);
            System.out.println(arC.getclubName());
            if(s.equals("YearlySalary")){
                for(Club c: clubs){
                    if(c.getclubName().equals("Arsenal")){
                        sb.append("Total Yearly Salary of Club"+" "+c.getclubName());
                        clubPlayers = c.clubPlayerList(c,playerList);
                        break;
                    }
                }
                sb.append("\n");
                for(Player p : clubPlayers){
                    yearlySalary+=p.getYearlysalary();
                }
                sb.append(yearlySalary);
                playerInfo.setText(sb.toString());

            }

            else if(s.equals("MaximumSalary")){
                double maxSalary = arC.getMaximumSalary();
                for(Player p : clubPlayers){
                    if(p.getSalary() > maxSalary){
                        maxSalary = p.getSalary();
                        p1 = p;
                    }
                }
                System.out.println(p1);
                sb.append("Player Having Maximum Salary");
                sb.append("\n");
                sb.append(p1);
                playerInfo.setText(sb.toString());

            }

            else if(s.equals("MaximumAge")){
                int maxAge = 0;
                for(Player p : clubPlayers){
                    if(p.getAge() > maxAge){
                        maxAge = p.getAge();
                        p1 = p;
                    }
                }
                System.out.println(p1);
                sb.append("Player Having Maximum Age");
                sb.append("\n");
                sb.append(p1);
                playerInfo.setText(sb.toString());
            }

            else if(s.equals("MaximumHeight")){
                double maxHeight = 0.0;
                for(Player p : clubPlayers){
                    if(p.getHeight() > maxHeight){
                        maxHeight = p.getHeight();
                        p1 = p;
                    }
                }
                System.out.println(p1);
                sb.append("Player Having Maximum Height");
                sb.append("\n");
                sb.append(p1);
                playerInfo.setText(sb.toString());
            }
        }

        else if(check.isManCpressed()){
            StringBuilder sb1 = new StringBuilder();
            Club ManC = new Club();
            for(Club c: clubs){
                if(c.getclubName().equals("Manchester City")){
                    ManC = c;
                }
            }
            clubPlayers = ManC.clubPlayerList(ManC,playerList);
            System.out.println(ManC.getclubName());
            if(s.equals("YearlySalary")){
                sb1.append("Total Yearly Salary of Club"+"    "+ ManC.getclubName());
                for(Player p : clubPlayers){
                    yearlySalary+=p.getYearlysalary();
                }
                sb1.append(yearlySalary);
                playerInfo.setText(sb1.toString());
            }

            else if(s.equals("MaximumSalary")){
                double maxSalary = 0;
                for(Player p : clubPlayers){
                    if(p.getSalary() > maxSalary){
                        maxSalary = p.getSalary();
                        p1 = p;
                    }
                }
                sb1.append("Player Having Maximum Salary");
                sb1.append("\n");
                sb1.append(p1);
                playerInfo.setText(sb1.toString());
            }

            else if(s.equals("MaximumAge")){
                int maxAge = 0;
                for(Player p : clubPlayers){
                    if(p.getAge() > maxAge){
                        maxAge = p.getAge();
                        p1 = p;
                    }
                }
                sb1.append("Player Having Maximum Age");
                sb1.append("\n");
                sb1.append(p1);
                playerInfo.setText(sb1.toString());
            }

            else if(s.equals("MaximumHeight")){
                double maxHeight = 0.0;
                for(Player p : clubPlayers){
                    if(p.getHeight() > maxHeight){
                        maxHeight = p.getHeight();
                        p1 = p;
                    }
                }
                sb1.append("Player Having Maximum Height");
                sb1.append("\n");
                sb1.append(p1);
                playerInfo.setText(sb1.toString());
            }

        }

        else if(check.isManUpressed()){
            StringBuilder sb2 = new StringBuilder();
            Club ManU = new Club();
            for(Club c : clubs){
                if(c.getclubName().equals("Manchester United")){
                    ManU = c;
                }
            }
            clubPlayers = ManU.clubPlayerList(ManU,playerList);
            if(s.equals("YearlySalary")){
                sb2.append("Total Yearly Salary of Club"+"   "+ManU.getclubName());
                for(Player p : clubPlayers){
                    yearlySalary+=p.getYearlysalary();
                }
                sb2.append("\n");
                sb2.append(yearlySalary);
                playerInfo.setText(sb2.toString());
            }

            else if(s.equals("MaximumSalary")){
                double maxSalary = 0.0;
                for(Player p : clubPlayers){
                    if(p.getSalary() > maxSalary){
                        maxSalary = p.getSalary();
                        p1 = p;
                    }
                }
                sb2.append("Player Having Maximum Salary");
                sb2.append("\n");
                sb2.append(p1);
                playerInfo.setText(sb2.toString());
            }

            else if (s.equals("MaximumAge")){
                int maxAge = 0;
                for(Player p : clubPlayers){
                    if(p.getAge() > maxAge){
                        maxAge = p.getAge();
                        p1 = p;
                    }
                }
                sb2.append("Player Having Maximum Age");
                sb2.append("\n");
                sb2.append(p1);
                playerInfo.setText(sb2.toString());
            }

            else if(s.equals("MaximumHeight")){
                double maxHeight = 0.0;
                for(Player p : clubPlayers){
                    if(p.getHeight() > maxHeight){
                        maxHeight = p.getHeight();
                        p1 = p;
                    }
                }
                sb2.append("Player Having Maximum Height");
                sb2.append("\n");
                sb2.append(p1);
                playerInfo.setText(sb2.toString());
            }
        }

        else if(check.isChelseapressed()){
            StringBuilder sb3 = new StringBuilder();
            Club Chelsea = new Club();
            for(Club c: clubs){
                if(c.getclubName().equals("Chelsea")){
                    Chelsea = c;
                }
            }
            clubPlayers= Chelsea.clubPlayerList(Chelsea,playerList);
            if(s.equals("YearlySalary")){
                sb3.append("Total Yearly Salary of Club"+"   "+Chelsea.getclubName());
                sb3.append("\n");
                for(Player p: clubPlayers){
                    yearlySalary+=p.getYearlysalary();
                }
                sb3.append(yearlySalary);
                playerInfo.setText(sb3.toString());
            }

            else if(s.equals("MaximumSalary")){
                double maxSalary = 0.0;
                for(Player p : clubPlayers){
                    if(p.getSalary() > maxSalary){
                        maxSalary = p.getSalary();
                        p1 = p;
                    }
                }
                sb3.append("Player Having Maximum Salary");
                sb3.append("\n");
                sb3.append(p1);
                playerInfo.setText(sb3.toString());
            }

            else if(s.equals("MaximumAge")){
                int maxAge = 0;
                for(Player p : clubPlayers){
                    if(p.getAge() > maxAge){
                        maxAge = p.getAge();
                        p1 = p;
                    }
                }
                sb3.append("Player Having Maximum Age");
                sb3.append("\n");
                sb3.append(p1);
                playerInfo.setText(sb3.toString());
            }

            else if(s.equals("MaximumHeight")){
                double maxHeight = 0.0;
                for(Player p : clubPlayers){
                    if(p.getHeight() > maxHeight){
                        maxHeight = p.getHeight();
                        p1 = p;
                    }
                }
                sb3.append("Player Having Maximum Height");
                sb3.append("\n");
                sb3.append(p1);
                playerInfo.setText(sb3.toString());
            }

        }

        else if(check.isLiverPpressed()){
             StringBuilder sb4 = new StringBuilder();
             Club LiverP = new Club();
             for(Club c: clubs){
                 if(c.getclubName().equals("Liverpool")){
                     LiverP = c;
                 }
             }
             clubPlayers = LiverP.clubPlayerList(LiverP,playerList);
            if(s.equals("YearlySalary")){
                sb4.append("Total Yearly Salary of Club"+"   "+LiverP.getclubName());
                sb4.append("\n");
                for(Player p: clubPlayers){
                    yearlySalary+=p.getYearlysalary();
                }
                sb4.append(yearlySalary);
                playerInfo.setText(sb4.toString());
            }

            else if(s.equals("MaximumSalary")){
                double maxSalary = 0.0;
                for(Player p : clubPlayers){
                    if(p.getSalary() > maxSalary){
                        maxSalary = p.getSalary();
                        p1 = p;
                    }
                }
                sb4.append("Player Having Maximum Salary");
                sb4.append("\n");
                sb4.append(p1);
                playerInfo.setText(sb4.toString());
            }

            else if(s.equals("MaximumAge")){
                int maxAge = 0;
                for(Player p : clubPlayers){
                    if(p.getAge() > maxAge){
                        maxAge = p.getAge();
                        p1 = p;
                    }
                }
                sb4.append("Player Having Maximum Age");
                sb4.append("\n");
                sb4.append(p1);
                playerInfo.setText(sb4.toString());
            }

            else if(s.equals("MaximumHeight")){
                double maxHeight = 0.0;
                for(Player p : clubPlayers){
                    if(p.getHeight() > maxHeight){
                        maxHeight = p.getHeight();
                        p1 = p;
                    }
                }
                sb4.append("Player Having Maximum Height");
                sb4.append("\n");
                sb4.append(p1);
                playerInfo.setText(sb4.toString());
            }

        }
    }

    @FXML
    public void SearchPlayer(ActionEvent event) throws Exception {
        isSearched = true;
        playerList = players.getplayerList();
        System.out.println(playerList);
        Player p1 = new Player();
        System.out.println("In searching");
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Player You Searched");
        sb7.append("\n");
        playerName = playerSearch.getText();
        System.out.println(playerName);
        System.out.println(playerList);
        for (Player p : playerList) {
            if (p.getName().equals(playerName)) {
                System.out.println(p);
                p1 = p;
                sb7.append(p);
                break;
            }
        }
        //sb7.append(p1);

        playerInfo.setText(sb7.toString());




    }

    @FXML
    void SearchPosition(ActionEvent event) throws Exception {
        playerList = players.getplayerList();
        StringBuilder sb8 = new StringBuilder();
        System.out.println("In Position searching.......");
        sb8.append("\t\t\t\t\t\t"+"Position Wise Players");
        sb8.append("\n");
        String positionName = positionText.getText();
        for(Player p: playerList){
            if(p.getPosition().equals(positionName)){
                sb8.append("\t\t\t"+p.getName());
                sb8.append("\n");
            }
        }
        playerInfo.setText(sb8.toString());

    }

    @FXML
    void SearchSalary(ActionEvent event) throws Exception {
        playerList = players.getplayerList();
        StringBuilder sb6 = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        System.out.println("In Salary searching");
        sb6.append("\t\t\t\t\t\t"+"Salary Wise Players");
        sb6.append("\n");
        String salaryRange = salaryText.getText();
        char[] ch = salaryRange.toCharArray();
        double salary1,salary2;
        int idx;
        idx = new String(ch).indexOf(' ');
        for(char k:ch){
            if(k == ' '){
                break;
            }
            else{
                str1.append(k);
            }
        }
        for(int i= idx+1; i<ch.length; ++i){
            str2.append(ch[i]);
        }
        salary1 = Double.parseDouble(str1.toString());
        System.out.println(salary1);
        salary2 = Double.parseDouble(str2.toString());
        System.out.println(salary2);
        for(Player p: playerList){
            if(p.getSalary() >=salary1 && p.getSalary()<=salary2 ){
                sb6.append("\t\t\t"+p.getName());
                sb6.append("\n");
            }
        }
        playerInfo.setText(sb6.toString());

    }

    @FXML
    void sellPlayer(ActionEvent event) throws Exception {
        playerList = players.getplayerList();
        String sellPlayer = sellPlayerText.getText();
        isSold = true;
        for(Player p : playerList){
            if(p.getName().equals(sellPlayer)){
                sellPlayers.add(p);
                break;
            }
        }
        System.out.println(sellPlayers);
    }

    public boolean isSoldPlayer(){
        return this.isSold;
    }

    public List getSellPlayerList(){
        return this.sellPlayers;
    }

    //SellListController controller = new SellListController();

    @FXML
    void LoadBuyList(ActionEvent event) {
        try{
            main.showAuctionPage();
            //controller.load();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void showImage(ActionEvent event) throws IOException {
        Image  image = null;
        System.out.println(playerName);
        if(isSearched) {
            if (playerName.equals("Paul Pogba")) {
                System.out.println("In pogba");
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Paul Pogba.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }
            else if (playerName.equals("David de Gea")) {
                System.out.println("In david");
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\David de Gea.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Harry Maguire")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Harry Maguire.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Mohamed Salah")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Mohamed Salah.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Bruno Fernandes")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Bruno Fernandes.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Edinson Cavani")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Edinson Cavani.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Ederson")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Ederson.png";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Ruben Dias")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Ruben Dias.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }


            else if(playerName.equals("Kevin De Bruyne")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Kevin De Bruyne.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Ilkay Gundogan")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Ilkay Gundogan.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Raheem Sterling")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Raheem Sterling.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Edouard Mendy")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Edouard Mendy.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Cesar Azpilicueta")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Cesar Azpilicueta.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("N'Golo Kante")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\N'Golo Kante.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Jorginho")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Jorginho.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Timo Werner")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Timo Werner.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Alisson")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Alisson.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Virgil van Dijk")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Virgil van Dijk.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Jordan Henderson")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Jordan Henderson.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Thiago Alcantaram")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Thiago Alcantaram.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Bernd Leno")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Bernd Leno.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Hector Bellerin")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Hector Bellerin.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Granit Xhaka")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Granit Xhaka.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Thomas Partey")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Thomas Partey.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else if(playerName.equals("Pierre-Emerick Aubameyang")){
                path = "F:\\Level 1 Term 2 materials\\CSE 108\\JavaFx Projects\\JavaFxP5\\src\\Files\\Pierre-Emerick Aubameyang.jpg";
                byte[] imageByte = new FileInputStream(path).readAllBytes();
                image = new Image(new ByteArrayInputStream(imageByte));
            }

            else{
                main.showAlert();
            }




            playerImage.setImage(image);
        }

    }


}
