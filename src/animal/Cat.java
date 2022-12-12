package animal;

public class Cat extends Animal {
    private String sound;

    public Cat(String breed, Integer lifespan, String behavior, Double price) {
        super(breed, lifespan, behavior, price);
    }

    public String getSound() {
        return "Meow!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setSound() {
        this.sound = "Meow!";
    }
}
