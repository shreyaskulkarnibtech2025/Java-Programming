class BankAccount {
    private final String accountNumber;
    private String accountHolder = "Alex Smith";
    private double balance = 150000.00;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : Rs" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-98765");
        account.displayAccount();

        // account.accountNumber = "ACC-00000"; // Compile Error: cannot assign a value to final variable
    }
}