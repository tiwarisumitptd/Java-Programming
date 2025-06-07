//Write a Java program to demonstrate throw keyword.

public class Q42 {
            static void withdraw(int balance, int amount) {
                if (amount > balance) {
                    throw new ArithmeticException("Insufficient Balance");
                } else {
                    System.out.println("Withdrawal Successful! Remaining Balance: " + (balance - amount));
                }
            }

            public static void main(String[] args) {
                int balance = 1000;
                int amountToWithdraw = 1500;

                try {
                    withdraw(balance, amountToWithdraw);
                } catch (ArithmeticException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }

                System.out.println("Transaction ended.");
            }
    }