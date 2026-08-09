interface Printable {
    void printDetails();
}

class Student implements Printable {
    private String name = "Amit";
    private int rollNumber = 101;

    public void printDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
    }
}

class Employee implements Printable {
    private String name = "Preeti";
    private int empId = 5021;

    public void printDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Emp ID: " + empId);
    }
}

public class Main {
    public static void main(String[] args) {
        Printable s = new Student();
        Printable e = new Employee();

        s.printDetails();
        e.printDetails();
    }
}