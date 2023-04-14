package Lesson_2_65.fruitbase.customers;

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class UniqueCustomer extends Customer {

    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> uniqueFruits = new ArrayList<>();
        for (Fruit fruit : cargo.getFruits()) {
            if (!purchases.contains(fruit)) {
                uniqueFruits.add(fruit);
            }
        }
        purchases.addAll(uniqueFruits);
        cargo.removeFruits(uniqueFruits);
        return uniqueFruits;
    }
}
