package main.java.com.training.oop.Inheritance;

public class mainApp {
    public static void main(String[] args) {
        mainApp app = new mainApp();
        app.createEmployee();
        app.createCustomer();
    }

    private void createCustomer() {
        Customer customer = new Customer();
        customer.name ="Binzu";
        customer.address ="Paro";
        customer.emailId ="BOB@test.com";
        customer.accountBranch = "Thimpu";
        customer.accountNumber="0012323A";
        customer.availableBalance= 34545.02f;
        System.out.println(customer.getPersonalInfo());
    }

    private void createEmployee() {
        Employee employee = new Employee();
        employee.name ="Maya";
        employee.address ="Thimpu";
        employee.emailId ="Maya@bob.bt";
        employee.employeeType = "Permanent";
        employee.department = "Operations";
        employee.extension = "004";
        employee.workingBranch = "Paro";
        System.out.println(employee.getPersonalInfo());
    }
}
