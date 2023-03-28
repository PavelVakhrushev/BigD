package Lesson_2_65.fruitbase.customers;

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Freshness;
import Lesson_2_65.fruitbase.fruits.Fruit;

class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.getFreshness() == Freshness.FRESH) {
                if (numOfPurchases < purchases.length) {
                    purchases[numOfPurchases++] = fruit;
                }
            }
        }
    }
}
