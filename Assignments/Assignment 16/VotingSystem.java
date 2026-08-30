import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());

            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old to vote.");
            }

            System.out.println("Voter registered successfully! You are eligible to vote.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}