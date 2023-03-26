package Lesson_2_65.fruitbase.customers;

public class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(String[] fruits) {
        for (String fruit : fruits) {
            if (fruit.startsWith("Fresh")) {
                purchases[index] = fruit;
                index++;
            }
        }
    }
}
