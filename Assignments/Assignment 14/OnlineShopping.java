import java.util.Scanner;

class OnlineShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemPrice = 250;

        System.out.println("Product Price per unit: Rs" + itemPrice);
        System.out.print("Enter quantity to purchase: ");

        try {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than zero.");
            }

            double totalCost = itemPrice * quantity;
            System.out.println("Order successful! Total Cost: Rs" + totalCost);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid whole number for quantity.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}