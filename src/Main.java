public class Main {
    public static void main(String[] args) {
        /**
         * create an Animal object
         * create a Lion object
         * create a Cow object
         * executes the animalSound() method on all the 3 objects
         */
        Animal animal = new Animal();
        Animal lion = new Lion();
        Animal cow = new Cow();
        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}