package Lesson_2_58.Task_2.com.fruitbase;

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public class Cargo {

    private final Fruit[] fruits;
    private int count;

    public Cargo() {
        fruits = new Fruit[10];
        count = 0;
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < count; i++) {
            totalWeight += fruits[i].getWeight();
        }
        return totalWeight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        for (Fruit fruit : fruits) {
            price = price.add(fruit.getPrice());
        }
        return price;
    }

    void addFruit(Fruit fruit) {
        if (count < fruits.length) {
            fruits[count++] = fruit;
        }
    }

    public boolean isEmpty() {

        return false;
    }
}


