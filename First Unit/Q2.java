import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Declaration method
        int num;
        double c,d,e;

        // Static Initialization
        int a = 50;
        System.out.println("The value of variable a is: "+a);
        double b = 90.876;
        System.out.println("The value of variable b is: "+b);
        String str = "Hello Developers";
        System.out.println(str);

        // Dynamic initialization method
        Scanner sc = new Scanner(System.in);
        double value;
        System.out.println("Enter the value of double var: ");
        value = sc.nextDouble();
        System.out.println(value);

        System.out.println("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.println(num1);
    }
}
