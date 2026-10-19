class BankAccount {
    private int balance = 1000;
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: Rs" + amount + " | Balance: Rs" + balance);
    }
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew:  Rs" + amount + " | Balance: Rs" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed withdrawal of Rs" + amount + " | Insufficient Balance: Rs" + balance);
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                account.deposit(2000);
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "DepositThread");

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                account.withdraw(1500);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "WithdrawThread");
        depositThread.start();
        withdrawThread.start();
    }
}