//Write a Java program to demonstrate throws keyword.

public class Q43 {
    public static void riskyMethod() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int num = 10 / 0;
        System.out.println("Division result: " + num);

        int[] arr = {8, 0, 5, 2, 6, 5, 3, 6, 7, 6};
        System.out.println("Array Index value: " + arr[12]);
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
