public class Q18 {
            int id;
            String name;

            // Parameterized constructor
            Q18(int i, String n) {
                id = i;
                name = n;
            }

            // Copy constructor
            Q18(Q18 s) {
                id = s.id;
                name = s.name;
            }

            void display() {
                System.out.println("ID: " + id + ", Name: " + name);
            }


        public static void main(String[] args) {
            Q18 s1 = new Q18(101, "Sumit");  // original object
            Q18 s2 = new Q18(s1);            // copy object using copy constructor

            System.out.println("Original Object:");
            s1.display();

            System.out.println("Copied Object:");
            s2.display();
        }
    }
