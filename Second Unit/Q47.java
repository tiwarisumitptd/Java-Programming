// Write a Java program to demonstrate getPriority and setPriority thread functions.

public class Q47 {
    public static void main(String[] args) {
        Thread t1 = new Thread1 ();
        Thread t2 = new Thread2 ();
        t1.start();
        t2.setPriority(3);
        t2.start();
        System.out.println(t2.getPriority());
    }

    static class Thread1 extends Thread {
        public void run ()  {
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority());
        }
    }
}