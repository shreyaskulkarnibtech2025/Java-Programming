class Employee {
    String name = "Alex";
    double salary = 1200000.0;

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: Rs" + salary);
    }
}

class Manager extends Employee {
    double bonus = 120000.0;

    void displayManagerDetails() {
        // Accessing parent method using super
        super.displayInfo();
        
        double totalEarnings = super.salary + this.bonus;
        System.out.println("Manager Total Earnings: Rs" + totalEarnings);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.displayManagerDetails();
    }
}