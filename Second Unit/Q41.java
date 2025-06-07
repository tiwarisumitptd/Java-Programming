//Write a Java program to demonstrate finally block.

public class Q41 {
    public static void main(String[] args) {
        try {
            int [] arr = {9,5,6,9,8,3,3,3,7,1};
            System.out.println("Index value of "+ arr [13]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Caught: "+e.getMessage());
            //e.printStackTrace();
        }

        try {
            int a = 10/0;
            System.out.println(a);
        }

        catch (ArithmeticException e) {
            //System.out.println("Error Caught: "+e.getMessage());
             e.printStackTrace();
        }

        finally {
            System.out.println ("Finally block executed: ");
        }
    }
}