package main.java.com.training.oop;
//write a program that would print the information (name, year of joining,monthly salary, address, total earned till now)
// of three employees by creating a class named 'Employee'.Here if date of joining is 2017 that means it is from 1St of january2017?
//the output should be as follows:
//Name      year of joining  address    monthlySalary totalearned
//tshering     2017           Thimphu     20000
//Tashi        2019           Bhutan       30000
//Sunil        2020           Kathmandu     25000

public class Employee{
    public Employee(String name,int yearJoin, String address, int salary ){
        this.name = name;
        this.yearJoin = yearJoin;
        this.salary = salary;
        this.address = address;

    }
    public Employee() {
    }
    String name;
    int yearJoin;
    int salary;
    String address;

    public int getTotalEarned(){
        int totalYear = 2024 - yearJoin;
        int totalMonth = totalYear*12+2;
        int totalEarned = totalMonth*salary;
        return totalEarned ;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearJoin=" + yearJoin +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
