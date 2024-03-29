package Lesson_3_10_2.fruitbase.customers;


import Lesson_3_10_2.fruitbase.Cargo;
import Lesson_3_10_2.fruitbase.fruits.Fruit;

import java.util.List;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> cargoFruits = cargo.getFruits();
        for (Fruit fruit : cargoFruits) {
            if (!purchases.contains(fruit)) {
                purchases.add(fruit);
            }
        }
        cargo.removeFruits(purchases);
        return purchases;
    }
}
