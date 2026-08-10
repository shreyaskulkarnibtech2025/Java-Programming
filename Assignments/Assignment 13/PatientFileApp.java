import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PatientFileApp {
    public static void main(String[] args) {
        String fileName = "patients.txt";

        // Write Patient Details to File
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("P-201 | Name: John Doe | Age: 45 | Diagnosis: Flu\n");
            writer.write("P-202 | Name: Emma Watson | Age: 30 | Diagnosis: Allergy\n");
            System.out.println("Patient records written to file.\n");
        } catch (IOException e) {
            System.out.println("Error writing patient file: " + e.getMessage());
        }

        // Read and Display Patient Details from File
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("=== PATIENT RECORDS ===");
            while (fileScanner.hasNextLine()) {
                String record = fileScanner.nextLine();
                System.out.println(record);
            }
        } catch (IOException e) {
            System.out.println("Error reading patient file: " + e.getMessage());
        }
    }
}