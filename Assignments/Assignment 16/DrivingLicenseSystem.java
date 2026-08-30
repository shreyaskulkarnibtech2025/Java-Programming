import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException(String message) {
        super(message);
    }
}

class DrivingLicenseSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());

            if (age < 18) {
                throw new UnderAgeException("User is under 18. Not eligible for a driving license.");
            }

            System.out.println("Verification successful: User is eligible for a driving license.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age.");
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}