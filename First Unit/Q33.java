public class Q33 {

    public static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class
    public static class Dog extends Animal {
        // Overriding the sound() method
        void sound() {
            super.sound(); // calling parent class (Animal) method
            System.out.println("Dog barks");
        }
    }

        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
        }
    }
