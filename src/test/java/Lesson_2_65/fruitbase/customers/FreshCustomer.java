package Lesson_2_65.fruitbase.customers;

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Fruit;


import java.util.ArrayList;
import java.util.List;

public class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> freshFruits = new ArrayList<>();
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.isFresh()) {
                freshFruits.add(fruit);
            }
        }
        purchases.addAll(freshFruits);
        cargo.removeFruits(freshFruits);
        return purchases;
    }
}


