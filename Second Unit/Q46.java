//Write a Java program to demonstrate getName, setName and  getId thread functions.

public class Q46 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        t1.setName("MyFirstThread");
        t1.start();

        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread ID: " + t1.getId());
    }
}
