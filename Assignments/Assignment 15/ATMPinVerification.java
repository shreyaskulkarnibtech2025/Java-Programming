import java.util.Scanner;

class ATMPinVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 4321;

        System.out.print("Enter 4-digit PIN: ");

        try {
            int enteredPin = Integer.parseInt(scanner.nextLine());

            if (enteredPin != correctPin) {
                throw new Exception("Incorrect PIN entered. Transaction canceled.");
            }
            System.out.println("PIN verified successfully! Access granted.");
        } catch (NumberFormatException e) {
            System.out.println("Error: PIN must contain numbers only.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Verification process completed.");
            scanner.close();
        }
    }
}