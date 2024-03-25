package main.java.com.training.oop;

public class Application{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tshering",2017,"Thimphu",20000);
        Employee employee2 = new Employee("Tashi",2019,"Thimphu",30000);
        Employee employee3 = new Employee("Dema",2020,"Thimphu",25000);
        System.out.println("Name:      " + "      "+ "    Year of joining"+ "    "+"     Address"+ "     "+"     Monthly salary"+ " " + "   Total earned");
        System.out.println(employee1+"total earned:"+employee1.getTotalEarned());
        System.out.println(employee2+"total earned:"+employee2.getTotalEarned());
        System.out.println(employee3+"total earned:"+employee3.getTotalEarned());

    }
}