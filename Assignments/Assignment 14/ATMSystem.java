import java.util.Scanner;

class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;

        System.out.println("Current Balance: Rs" + balance);
        System.out.print("Enter withdrawal amount: ");

        try {
            double amount = Double.parseDouble(scanner.nextLine());

            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance for this withdrawal.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: Rs" + balance);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numerical amount.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}