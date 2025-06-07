public class Q27 {
        public static class Student {

            void name() {
                String name = "Sumit";
                System.out.println("Name of student is: " + name);
            }
        }

        // Faculty class extends Student
        public static class Faculty extends Student {
            int id = 44;

            void nameS() {
                System.out.println("Faculty ID is: " + id);
            }
        }

        public static void main(String[] args) {
            Faculty obj = new Faculty();
            obj.nameS();
            obj.name();
        }
    }
