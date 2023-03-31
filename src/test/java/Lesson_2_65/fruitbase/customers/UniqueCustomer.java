package Lesson_2_65.fruitbase.customers;

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Fruit;

import java.util.List;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        List<Fruit> cargoFruits = List.of(cargo.getFruits());
        for (Fruit fruit : cargoFruits) {
            if (!purchases.contains(fruit)) {
                purchases.add(fruit);
            }
        }
        return purchases;
    }
}