public class MultiThreadPrinter {
    public static void main(String[] args) {
        Runnable printNumbers = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " printed: " + i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(printNumbers, "Thread-1");
        Thread t2 = new Thread(printNumbers, "Thread-2");
        Thread t3 = new Thread(printNumbers, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}