//Write a Java program to demonstrate constructing a user defined thread through Thread class.

public class Q44 {
    public static void main(String[] args) {
            new A().start();
            new B().start ();
            new C().start ();
        }

        static class A extends Thread {
            public void run () {
                for (int i = 1; i<=5; i++) {
                    System.out.println("i= "+i);
                }
                System.out.println ("Thread A is created");
            }
        }

        static class B extends Thread {
            public void run () {
                for (int j = 9; j>=0; j--) {
                    System.out.println("j ="+j);
                }
                System.out.println("Thread B is created");
            }
        }

        static class C extends Thread {
            public void run () {
                for (int j = 9; j>=0; j--) {
                    System.out.println("j ="+j);
                }
                System.out.println("Thread C is created successfully");
            }
        }

    }