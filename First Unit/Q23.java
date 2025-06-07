public class Q23 {

        // Method with arguments but no return value
        void greetUser(String name) {
            System.out.println("Hello, " + name + "! Welcome to Java Programming.");
        }

        public static void main(String[] args) {
            Q23 obj = new Q23();  // creating an object

            obj.greetUser("Sumit"); // calling the method with an argument
            obj.greetUser("Priyanshu"); // calling the method with another argument
        }
    }