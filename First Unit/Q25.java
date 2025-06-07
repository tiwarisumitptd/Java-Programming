// Top-level class
public class Q25 {

    // Make Student class static or move it out as a separate class
    public static class Student {
        int id = 44;

        void name() {
            String name = "Sumit";
            System.out.println("Name of student is: " + name);
        }
    }

    // Faculty class extends Student
    public static class Faculty extends Student {
        int id = 45;

        void name() {
            super.name();  // calling parent class method
            System.out.println("Faculty ID is: " + id);
        }
    }

    public static void main(String[] args) {
        Faculty obj = new Faculty();
        obj.name();
    }
}
