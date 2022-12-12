package animal;

public class Dog extends Animal {
    private String sound;

    public Dog(String breed, Integer lifespan, String behavior, Double price) {
        super(breed, lifespan, behavior, price);
    }

    public String getSound() {
        return "Woof!";
    }
}
