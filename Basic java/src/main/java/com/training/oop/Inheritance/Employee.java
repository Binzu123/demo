package main.java.com.training.oop.Inheritance;


public class Employee extends User{
    protected String department;
    protected String workingBranch;
    protected String extension;
    protected String employeeType;
    String getPersonalInfo(){
        String employeeInfo =  super.getPersonalInfo() +" : " + this.workingBranch+ " : " + this.employeeType + " : " + this.extension + " : "+ this.department;
        return employeeInfo;
    }
}
