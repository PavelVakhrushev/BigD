package Lesson_2_58.Task_2.com.fruitbase;

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public class Cargo {

    private Fruit[] fruits;

    public Cargo() {
        fruits = new Fruit[0];
    }

    public double getWeight() {
        double weight = 0.0;
        for (Fruit fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        for (Fruit fruit : fruits) {
            price = price.add(fruit.getPrice());
        }
        return price;
    }

    void addFruit(Fruit fruit) {
        int len = fruits.length;
        Fruit[] newFruits = new Fruit[len + 1];
        System.arraycopy(fruits, 0, newFruits, 0, len);
        newFruits[len] = fruit;
        fruits = newFruits;
    }
}


