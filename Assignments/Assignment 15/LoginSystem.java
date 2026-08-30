import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "adminPassword123";

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (!correctPassword.equals(enteredPassword)) {
                throw new Exception("Invalid password entered. Access denied.");
            }
            System.out.println("Login successful! Welcome.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Login session closed.");
            scanner.close();
        }
    }
}