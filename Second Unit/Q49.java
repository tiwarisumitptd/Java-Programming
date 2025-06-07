// Write a Java program to demonstrate suspend, resume and stop thread functions.

public class Q49 extends Thread {
    private volatile boolean running = true;
    private volatile boolean paused = false;

    public void run() {
        int i = 1;
        while (running) {
            if (!paused) {
                System.out.println("Running: " + i);
                i++;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public void pauseThread() {
        paused = true;
    }

    public void resumeThread() {
        paused = false;
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        Q49 t = new Q49();
        t.start();

        Thread.sleep(2000);
        t.pauseThread();
        System.out.println("Thread paused...");

        Thread.sleep(2000);
        t.resumeThread();
        System.out.println("Thread resumed...");

        Thread.sleep(2000);
        t.stopThread();
        System.out.println("Thread stopped.");
    }
}