public class Q20 {
        int add(int a, int b) {
            int sum = a + b;
            return sum;
        }

        public static void main(String[] args) {
            Q20 calc = new Q20();
            int num1 = 10;
            int num2 = 20;

            int result = calc.add(num1, num2);

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        }
    }