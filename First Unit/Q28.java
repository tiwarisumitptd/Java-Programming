public class Q28 {
    public static class Student {
        String name;
        int age;

        Student (String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo () {
            System.out.println("Age of student is: "+name);
            System.out.println("Age of the student is: "+age);
        }
    }

    public static class person extends Student {
        int id;
        person (String name, int age, int id) {
            super (name, age);
            this.id = id;
        }

        void displayPersonInfo () {
            displayInfo();
            System.out.println("Id of the person: "+id);
        }
    }

    public static void main(String[] args) {
        person p1 = new person("Sumit", 20, 10234);
        p1.displayPersonInfo();
    }
}
