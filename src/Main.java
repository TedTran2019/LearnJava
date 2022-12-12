import animal.Animal;
import animal.Dog;
import animal.Cat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        dog();
        cat();
        seller();
    }

    private static void seller() {
        Animal.setSeller("Petco");
        System.out.println("Seller: " + Animal.getSeller());
        Dog dog = new Dog(null, 0, null, 0.0);
        Cat cat = new Cat(null, 0, null, 0.0);
        System.out.println("Seller: " + dog.getSeller());
        System.out.println("Seller: " + cat.getSeller());
        dog.setSeller("PetSmart");
        System.out.println("Seller: " + Animal.getSeller());
        System.out.println("Seller: " + dog.getSeller());
        System.out.println("Seller: " + cat.getSeller());
    }
    private static void cat() {
        Cat cat = new Cat("Persian", 15, "Calm", 100.0);
        printCatInfo(cat);
    }

    private static void printCatInfo(Cat cat) {
        System.out.println("Cat breed: " + cat.getBreed());
        System.out.println("Cat lifespan: " + cat.getLifespan());
        System.out.println("Cat behavior: " + cat.getBehavior());
        System.out.println("Cat price: " + cat.getPrice());
    }

    private static void dog() {
        Dog dog = new Dog("Husky", 12, "Aggressive", 3000.0);
        System.out.println(dog.getSound());
        Animal dog2 = new Dog("Pitbull", 10, "Aggressive", 2000.0);
        System.out.println(((Dog)dog2).getSound());
        if (dog2 instanceof Dog) {
         System.out.println("Good");
        }
        if (dog instanceof Animal) {
            System.out.println("Good");
        }
        printDogInfo(dog);
        dog.setBreed("Poodle");
        dog.setLifespan(15);
        dog.setBehavior("Friendly");
        dog.setPrice(1000.0);
        printDogInfo(dog);
    }

    private static void printDogInfo(Dog dog) {
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Lifespan: " + dog.getLifespan());
        System.out.println("Behavior: " + dog.getBehavior());
        System.out.println("Price: " + dog.getPrice());
    }
}
