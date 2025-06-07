import java.util.Scanner;

public class Q37 {

    public static class Cricketer {
        Scanner sc = new Scanner(System.in);
        int joursey_number, age;
        String name;

        void getName () {
            System.out.println("Enter the Joursey number of player: ");
            joursey_number = sc.nextInt();
            System.out.println("Enter the age of the player: ");
            age = sc.nextInt();
            System.out.println("Enter the name of the player: ");
            name = sc.next();
        }

    }

    public static class CricketersDetails extends Cricketer {
        void putName () {
            System.out.println("Name of the player: "+name);
            System.out.println("Age of the player: "+age);
            System.out.println("Joursey Number of the player: "+age);
        }
    }

    public static class AddCricketer extends CricketersDetails{
            int MaxRuns;
            Scanner sc = new Scanner(System.in);
            void takeInput (){
                System.out.println("Enter the maximum run of the player: ");
                MaxRuns = sc.nextInt();
                System.out.println("Maximum run of the player: "+MaxRuns);
            }
    }

    public static void main(String[] args) {
       AddCricketer p1 = new AddCricketer();
       p1.getName();
       p1.putName();
       p1.takeInput();
    }
}
