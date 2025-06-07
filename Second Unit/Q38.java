// Write a Java program to demonstrate to try and catch block for null pointer exception.

public class Q38 {
    public static void main(String[] args) {
        try{
            String str= null;
            System.out.println(str.length());
        }

        catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}