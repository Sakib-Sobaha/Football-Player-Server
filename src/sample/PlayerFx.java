package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class PlayerFx {
    private final SimpleStringProperty name;
    private final SimpleStringProperty country;
    private final SimpleIntegerProperty age;
    private final SimpleDoubleProperty height;
    private final SimpleStringProperty club;
    private final SimpleStringProperty position;
    private final SimpleIntegerProperty number;
    private final SimpleDoubleProperty salary;
    private Country countryName;
    private final SimpleDoubleProperty yearlysalary;

    public PlayerFx(){

        name = new SimpleStringProperty();
        country = new SimpleStringProperty();
        age = new SimpleIntegerProperty();
        height = new SimpleDoubleProperty();
        club = new SimpleStringProperty();
        position = new SimpleStringProperty();
        number = new SimpleIntegerProperty();
        salary = new SimpleDoubleProperty();
        yearlysalary = new SimpleDoubleProperty();
    }

    public PlayerFx(String name, String country, int age, double height, String club, String position, int number, double salary){

        this.name = new SimpleStringProperty(name);
        this.country = new SimpleStringProperty(country);
        this.age = new SimpleIntegerProperty(age);
        this.height = new SimpleDoubleProperty(height);
        this.club = new SimpleStringProperty(club);
        this.position = new SimpleStringProperty(position);
        this.number = new SimpleIntegerProperty(number);
        this.salary = new SimpleDoubleProperty(salary);
        yearlysalary = null;
    }

    public PlayerFx(String name, String country, int age, double height, String position, int number, double salary){

        this.name = new SimpleStringProperty(name);
        this.country = new SimpleStringProperty(country);
        this.age = new SimpleIntegerProperty(age);
        this.height = new SimpleDoubleProperty(height);
        this.position = new SimpleStringProperty(position);
        this.number = new SimpleIntegerProperty(number);
        this.salary = new SimpleDoubleProperty(salary);
        yearlysalary = null;
        club = null;
    }

    public void setName(String name) {
        this.name.set(name);
    }
    public String getName(){
        return this.name.get();
    }
    public void setCountry(String country){
        this.country.set(country);
    }
    public String getCountry(){
        return this.country.get();
    }
    public void setAge(int age){
        this.age.set(age);
    }
    public int getAge(){
        return this.age.get();
    }
    public void setHeight(double height){
        this.height.set(height);
    }
    public double getHeight(){
        return this.height.get();
    }
    public void setClub(String club){
        this.club.set(club);
    }
    public String getClub(){
        return this.club.get();
    }
    public void setNumber(int number){
        this.number.set(number);
    }
    public int getNumber(){
        return this.number.get();
    }
    public void setPosition(String position){
        this.position.set(position);
    }
    public String getPosition(){
        return this.position.get();
    }
    public void setSalary(double salary){
        this.salary.set(salary);
    }
    public double getSalary(){
        return this.salary.get();
    }
    public Country getCountryName(){
        return this.countryName;
    }
    public double getYearlysalary(){
        yearlysalary.set((this.salary.get()*365) / 7);
        return this.yearlysalary.get();
    }


    @Override
    public String toString(){
        getClass().getSimpleName();
        return "Player's Name : "+this.name+"\n"+"Country : "+this.country+"\n"+"Age : "+this.age+"\n"+"Height : "+this.height+"\n"+"Club : "+this.club+"\n"+"Number : "+this.number+"\n"+"Position : "+this.position+"\n"+"Salary : "+this.salary+"\n";
    }

}
