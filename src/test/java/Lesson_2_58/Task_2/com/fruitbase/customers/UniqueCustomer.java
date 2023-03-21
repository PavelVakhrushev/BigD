package Lesson_2_58.Task_2.com.fruitbase.customers;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(ArrayList<String> fruits) {
        HashSet<String> uniqueFruits = new HashSet<String>(purchases);
        for (String fruit : fruits) {
            if (!uniqueFruits.contains(fruit)) {
                purchases.add(fruit);
                uniqueFruits.add(fruit);
            }
        }
    }
}
