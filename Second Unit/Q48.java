// Write a Java program to demonstrate isAlive and join thread functions.

public class Q48 {
        class xyz extends Thread {

            xyz(String name) {
                super(name);
            }

            public void run() {
                try {
                    for (int i = 0; i <= 5; i++) {
                        System.out.println(getName());
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(getName() + " interrupted!");
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Q48 outer = new Q48();
            xyz obj1 = outer.new xyz("One");
            xyz obj2 = outer.new xyz("Two");
            xyz obj3 = outer.new xyz("Three");

            obj1.start();
            obj2.start();
            obj3.start();

            System.out.println("Thread One is alive: " + obj1.isAlive());
            System.out.println("Thread Two is alive: " + obj2.isAlive());

            obj1.join();
            obj2.join();
            obj3.join();

            System.out.println("All threads have finished execution.");
        }
    }