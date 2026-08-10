package faculty;

public class Faculty{
    private String name = "Dr. Smith";
    private String department = "Computer Science";

    public void displayFacultyInfo() {
        System.out.println("--- Faculty Information ---");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}