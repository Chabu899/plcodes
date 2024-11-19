class EvenThread extends Thread {
    private int limit;

    // Constructor to set the upper limit for even numbers
    EvenThread(int limit) {
        this.limit = limit;
    }

    // Run method for even number printing
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Pause to simulate work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class OddThread extends Thread {
    private int limit;

    // Constructor to set the upper limit for odd numbers
    OddThread(int limit) {
        this.limit = limit;
    }

    // Run method for odd number printing
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Pause to simulate work
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class exp5 {
    public static void main(String[] args) {
        int limit = 20; // Upper limit for even and odd numbers

        // Create and start threads
        EvenThread evenThread = new EvenThread(limit);
        OddThread oddThread = new OddThread(limit);

        evenThread.start();
        oddThread.start();
    }
}
