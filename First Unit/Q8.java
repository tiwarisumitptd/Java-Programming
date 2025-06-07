import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Enter the value of num: ");

        if (num % 2 == 0) {
            System.out.println("Given number is even number");
        }
        else {
            System.out.println("Given number is odd number");
        }
    }
}