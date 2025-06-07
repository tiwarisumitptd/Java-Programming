//Write a Java program to demonstrate to try and catch block for number exception.

public class Q39 {
    public static void main(String[] args) {
        try {
            int num = 10/0;
        }

        catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Error: "+ e.getMessage());
            // e.printStackTrace();
        }
    }
}