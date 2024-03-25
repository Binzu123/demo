package main.java.com.training.oop;

//public class MainApplication {
//    public static void main(String[] args) {
//        MainApplication mainApp = new MainApplication();
//        mainApp.objectConstructionWithEmptyConstructor();
//        mainApp.objectConstructionWithParametrizedConstructor();
//    }
//
//    private void objectConstructionWithParametrizedConstructor() {
//        System.out.println("Object with Parametrized Constructor...");
//        Student sonam = new Student("Bishnu Maya Gurung","XII","Tenzin Higher secondary school",1997);
//        System.out.println(sonam.name);
//        System.out.println(sonam.grade);
//        System.out.println(sonam.schoolName);
//        System.out.println(sonam.dobYear);
//        System.out.println("Feature of Student Class, i.e. Age of Bishnu: " + sonam.getAge());
//    }
//
//    private void objectConstructionWithEmptyConstructor() {
//        System.out.println("Object with Empty Constructor...");
//        Student Bishnu = new Student();
//        Bishnu.name = "Bishnu Maya Gurung";
//        Bishnu.grade = "XII";
//        Bishnu.schoolName = "Tenzin Higher secondary school";
//        Bishnu.dobYear = 1997;
//        System.out.println(Bishnu.name);
//        System.out.println(Bishnu.grade);
//        System.out.println(Bishnu.schoolName);
//        System.out.println(Bishnu.dobYear);
//        System.out.println("Feature of Student Class, i.e. Age of Bishnu: " + Bishnu.getAge());
//    }
//}

public class MainApplication {
    public static void main(String[] args) {
        MainApplication mainApp = new MainApplication();
        mainApp.objectConstructionWithEmptyConstructor();
        mainApp.objectConstructionWithParametrizedConstructor();
    }

    private void objectConstructionWithParametrizedConstructor() {
        System.out.println("Object with Parametrized Constructor...");
        Address homeAddress = new Address("Babena","Thimpu1","Thimpu","Bhutan");
        Address schoolAddress = new Address("Babena1","Thimpu2","Thimpu","Bhutan");
        Student bishnu = new Student("Bishnu Maya Gurung","XII","Tenzin Higher secondary School",1997, homeAddress, schoolAddress);
       /* System.out.println(sonam.name);
        System.out.println(sonam.grade);
        System.out.println(sonam.schoolName);
        System.out.println(sonam.dobYear);
        System.out.println(sonam.homeAddress.village);
        System.out.println(sonam.homeAddress.gewog);
        System.out.println(sonam.homeAddress.dzongkhag);
        System.out.println(sonam.homeAddress.country);*/

       /* Address schoolAddressReceived = sonam.schoolAddress;
        System.out.println(schoolAddressReceived.village);
        System.out.println(schoolAddressReceived.gewog);
        System.out.println(schoolAddressReceived.dzongkhag);
        System.out.println(schoolAddressReceived.country);
*/
        System.out.println(bishnu);
        System.out.println("Feature of Student Class, i.e. Age of Bishnu: " + bishnu.getAge());
    }

    private void objectConstructionWithEmptyConstructor() {
        System.out.println("Object with Empty Constructor...");
        Student bishnu = new Student();
        bishnu.name = "Sonam XYZ";
        bishnu.grade = "XII";
        bishnu.schoolName = "Thimpu School";
        bishnu.dobYear = 1997;

        Address homeAddress = new Address();
        homeAddress.village="Babena";
        homeAddress.gewog="Chang";
        homeAddress.dzongkhag="Thimpu";
        homeAddress.country="Bhutan";
        bishnu.homeAddress = homeAddress;

        Address schoolAddress = new Address();
        schoolAddress.village="Babena1";
        schoolAddress.gewog="Chang1";
        schoolAddress.dzongkhag="Thimpu";
        schoolAddress.country="Bhutan";
        bishnu.schoolAddress = schoolAddress;

//        System.out.println(sonam.name);
//        System.out.println(sonam.grade);
//        System.out.println(sonam.schoolName);
//        System.out.println(sonam.dobYear);
//        System.out.println(sonam.homeAddress.village);
//        System.out.println(sonam.homeAddress.gewog);
//        System.out.println(sonam.homeAddress.dzongkhag);
//        System.out.println(sonam.homeAddress.country);
//
//        Address schoolAddressReceived = sonam.schoolAddress;
//        System.out.println(schoolAddressReceived.village);
//        System.out.println(schoolAddressReceived.gewog);
//        System.out.println(schoolAddressReceived.dzongkhag);
//        System.out.println(schoolAddressReceived.country);
        System.out.println(bishnu);
        System.out.println("Feature of Student Class, i.e. Age of Bishnu: " + bishnu.getAge());


    }
}