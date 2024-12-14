package sample;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Player   {
    private String name;
    private String country;
    private int age;
    private double height;
    private String club;
    private String position;
    private int number;
    private double salary;
    private Country countryName;
    private double yearlysalary;
    private String path;
     public Player(){

    }
    public Player(String name, String country, int age, double height, String club, String position, int number, double salary){
        this.name = name;
        this.country = country;
        this.age = age;
        this.height = height;
        this.club = club;
        this.position = position;
        this.number = number;
        this.salary = salary;

    }

    public Player(String name, String country, int age, double height, String position, int number, double salary){
        this.name = name;
        this.country = country;
        this.age = age;
        this.height = height;
        this.position = position;
        this.number = number;
        this.salary = salary;

    }

    public static String toString(String s) {
         return s.toString();
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setClub(String club){
        this.club = club;
    }
    public String getClub(){
        return this.club;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return this.position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public Country getCountryName(){
        return this.countryName;
    }
    public double getYearlysalary(){
        yearlysalary = (this.salary*365) / 7;
        return this.yearlysalary;
    }
    /*public void setImage(String path){
         this.path = path;
    }
    public byte[] getImage() throws IOException {
         byte[] imageText = new FileInputStream(this.path).readAllBytes();
         return imageText;
    }*/


    @Override
    public String toString(){
        getClass().getSimpleName();
        return "Player's Name : "+this.name+"\n"+"Country : "+this.country+"\n"+"Age : "+this.age+"\n"+"Height : "+this.height+"\n"+"Club : "+this.club+"\n"+"Number : "+this.number+"\n"+"Position : "+this.position+"\n"+"Salary : "+this.salary+"\n";
        //return this.name+" "+this.country+" "+this.age+" "+this.position+" "+this.number+" "+this.salary;
    }




}
