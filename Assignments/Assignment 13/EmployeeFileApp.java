import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeFileApp {
    public static void main(String[] args) {
        String fileName = "employees.txt";

        // Write Employee Details to File
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("111, Amit Singh, Software Engineer, 75000\n");
            writer.write("112, Ram Shukla, Project Manager, 85000\n");
            System.out.println("Employee details saved to file successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read Employee Details from File
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("--- Employee Details From File ---");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}