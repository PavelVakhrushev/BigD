package Lesson_2_65.fruitbase.customers;

import java.util.ArrayList;

public class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            if (isFresh(fruit)) {
                purchases.add(fruit);
            }
        }
    }

    private boolean isFresh(String fruit) {
        // check if fruit is fresh
        return true;
    }
}
