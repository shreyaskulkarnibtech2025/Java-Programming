import faculty.Faculty;
import student.Student;
public class CollegeApp{
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        
        s.displayStudentInfo();
        f.displayFacultyInfo();
    }
}
