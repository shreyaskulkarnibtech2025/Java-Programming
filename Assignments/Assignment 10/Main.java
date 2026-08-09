abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " for card " + cardNumber);
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " via ID: " + upiId);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment card = new CreditCardPayment("1234-5678-9012");
        Payment upi = new UPIPayment("user@upi");

        card.processPayment(150.00);
        upi.processPayment(45.50);
    }
}