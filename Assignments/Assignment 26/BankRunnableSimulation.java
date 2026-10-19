class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited Rs" + amount + " | Current Balance: Rs" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew Rs" + amount + "  | Current Balance: Rs" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed withdrawal of Rs" + amount + " | Insufficient Balance: Rs" + balance);
        }
    }
}

// Runnable task for deposit operations
class DepositTask implements Runnable {
    private final BankAccount account;

    public DepositTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            account.deposit(2000);
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Runnable task for withdrawal operations
class WithdrawTask implements Runnable {
    private final BankAccount account;

    public WithdrawTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            account.withdraw(1500);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class BankRunnableSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create threads with explicit Runnable objects
        Thread depositThread = new Thread(new DepositTask(account), "DepositThread");
        Thread withdrawThread = new Thread(new WithdrawTask(account), "WithdrawThread");

        // Start tasks concurrently
        depositThread.start();
        withdrawThread.start();
    }
}