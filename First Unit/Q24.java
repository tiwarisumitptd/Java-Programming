public class Q24 {
    int id;
    String name;

    // Constructor using 'this' keyword
    Q24(int id, String name) {
        this.id = id;       // 'this.id' refers to the instance variable
        this.name = name;   // 'this.name' refers to the instance variable
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Q24 s1 = new Q24(101, "Sumit");
        Q24 s2 = new Q24(102, "Priyanshu");

        s1.display();
        s2.display();
    }
}