package Lesson_2_65.fruitbase.customers;

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Fruit;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (!isFruitInPurchases(fruit)) {
                if (numOfPurchases < purchases.length) {
                    purchases[numOfPurchases++] = fruit;
                }
            }
        }
    }

    private boolean isFruitInPurchases(Fruit fruit) {
        for (int i = 0; i < numOfPurchases; i++) {
            if (purchases[i].equals(fruit)) {
                return true;
            }
        }
        return false;
    }
}