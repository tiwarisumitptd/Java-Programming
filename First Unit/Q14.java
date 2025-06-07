public class Q14 {
        Q14() {
            System.out.println("Object created.");
        }

        // finalize method - called before object is destroyed
        @Override
        protected void finalize () throws Throwable {
            System.out.println("finalize() method called before garbage collection.");
        }

        public static void main(String[] args) {

            Q14 obj1 = new Q14();
            Q14 obj2 = new Q14();

            obj1 = null;
            obj2 = null;

            System.gc();

            System.out.println("Garbage Collection has been requested.");
        }
}