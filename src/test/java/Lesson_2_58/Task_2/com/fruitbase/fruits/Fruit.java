package Lesson_2_58.Task_2.com.fruitbase.fruits;


import java.math.BigDecimal;

public abstract class Fruit {

    private final double weight;
    private final BigDecimal price;
    private final String name;

    public Fruit(String name, double weight, BigDecimal price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
