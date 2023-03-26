package Lesson_2_65.fruitbase.customers;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(String[] fruits) {
        for (String fruit : fruits) {
            if (!isPurchased(fruit)) {
                purchases[index] = fruit;
                index++;
            }
        }
    }

    private boolean isPurchased(String fruit) {
        for (int i = 0; i < index; i++) {
            if (purchases[i].equals(fruit)) {
                return true;
            }
        }
        return false;
    }
}