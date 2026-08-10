package student;

public class Student {
    private String name = "John Doe";
    private int rollNo = 101;

    public void displayStudentInfo() {
        System.out.println("--- Student Information ---");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}