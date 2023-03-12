package Lesson_2_58.Task_2.com.fruitbase;


import Lesson_2_58.Task_2.com.fruitbase.fruits.*;

import java.math.BigDecimal;

public class FruitCatalogue {

    public static FruitCatalogue fruitBase;
    private final Fruit[] fruits;

    public FruitCatalogue() {
        fruits = new Fruit[]{
                new Apple("Apple", 1.5, new BigDecimal("500.00")),
                new Orange("Orange", 2.0, new BigDecimal("400.50")),
                new Banana("Banana", 1.0, new BigDecimal("500.50")),
                new Pineapple("Pineapple", 5.0, new BigDecimal("600.50"))
        };
    }

    Fruit findFruit(String name) {
        for (Fruit fruit : fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }

}

