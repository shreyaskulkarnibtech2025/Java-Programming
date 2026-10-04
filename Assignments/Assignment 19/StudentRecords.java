import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRecords {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       STUDENT RECORDS FROM DATABASE    ");
        System.out.println("========================================\n");

        String query = "SELECT student_id, name, roll_no, department, marks FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connected to database successfully!");
            System.out.println();

            // Table header
            System.out.println("+----+------------------+--------+------------------+-------+");
            System.out.println("| ID | Name             | RollNo | Department       | Marks |");
            System.out.println("+----+------------------+--------+------------------+-------+");

            int count = 0;

            while (rs.next()) {
                int    studentId  = rs.getInt("student_id");
                String name       = rs.getString("name");
                String rollNo     = rs.getString("roll_no");
                String department = rs.getString("department");
                double marks      = rs.getDouble("marks");

                System.out.printf("| %-2d | %-16s | %-6s | %-16s | %-5.1f |%n",
                        studentId, name, rollNo, department, marks);

                count++;
            }

            System.out.println("+----+------------------+--------+------------------+-------+");
            System.out.println("\nTotal records fetched: " + count);

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
