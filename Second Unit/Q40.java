//Write a Java program to demonstrate to try and multiple catch block for arithmetic and array out
//of bound exception.

public class Q40 {
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
                System.out.println("Error Caught: "+e.getMessage());
                // e.printStackTrace();
            }
    }
}