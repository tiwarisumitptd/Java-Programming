public class Q29 {
    public static class Sumit {
        void Developer () {
            System.out.println("Sumit is a software Developer");
        }
    }

    public static class Tiwari extends Sumit{
        void Developer () {
            System.out.println("I am also a software developer");
        }
    }

    public static class Engineer extends Sumit {
        void Developer () {
            System.out.println("I am a full stack developer");
        }
    }

    public static void main(String[] args) {
        Sumit er;

        er = new Engineer();
        er.Developer();

        er = new Tiwari();
        er.Developer();
    }
}
