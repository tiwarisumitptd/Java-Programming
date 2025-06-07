//Write a Java program to demonstrate data initialization through function.
import java.util.Scanner;

public class Q19 {
    Scanner sc = new Scanner(System.in);

    void getName () {
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Q19 obj = new Q19();
        obj.getName();
    }
}
