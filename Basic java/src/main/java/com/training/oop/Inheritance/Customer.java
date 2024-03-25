package main.java.com.training.oop.Inheritance;


public class Customer extends User{
    protected String accountNumber;
    protected float availableBalance;
    protected String accountBranch;

    protected String getPersonalInfo(){
        String customerInfo =  super.getPersonalInfo() +" : " + this.availableBalance+ " : " + this.accountNumber + " : " + this.accountBranch;
        return customerInfo;
    }
}
