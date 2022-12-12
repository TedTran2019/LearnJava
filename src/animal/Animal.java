package animal;

public abstract class Animal {
    private String breed, behavior;
    private Integer lifespan;
    private Double price;
    private static String seller;

    public static String getSeller() {
        return seller;
    }
    public static void setSeller(String seller) {
        Animal.seller = seller;
    }

    public Animal(String breed, Integer lifespan, String behavior, Double price) {
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public Integer getLifespan() {
        return lifespan;
    }

    public void setLifespan(Integer lifespan) {
        this.lifespan = lifespan;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
