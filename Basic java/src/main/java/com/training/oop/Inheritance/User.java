package main.java.com.training.oop.Inheritance;

public class User {

    protected String name;
    protected String address;
    protected String emailId;
    protected  int dob;

    String getPersonalInfo(){
        String personalInfo = this.name +" : " + this.address + " : "+ this.dob + " : " + this.emailId;
        return personalInfo;
    }

}
