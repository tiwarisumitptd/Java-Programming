//Write a Java program to demonstrate constructing a user defined thread through runnable
//interface.

public class Q45 {
    public static void main(String[] args) {
        Thread threadA = new Thread (new A());
        Thread threadB = new Thread (new B());
        threadA.start();
        threadB.start();
    }

    static class A implements Runnable {
        public void run () {
            for (int j = 0; j<=7; j++) {
                System.out.println("Thread A is called");
            }
        }
    }

    static class B implements Runnable {
        public void run () {
            for (int i = 0; i<=6; i++) {
                System.out.println("Thread B is called");
            }
        }
    }
}