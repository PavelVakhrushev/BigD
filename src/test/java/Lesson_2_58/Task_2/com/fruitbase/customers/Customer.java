package Lesson_2_58.Task_2.com.fruitbase.customers;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Customer {
    protected ArrayList<String> purchases;
    protected String name;

    public Customer(String name) {
        this.name = name;
        purchases = new ArrayList<String>();
    }

    public abstract void takeFruits(ArrayList<String> fruits);

    public void printPurchases() {
        System.out.println("Customer " + name + " purchased:");
        for (String fruit : purchases) {
            System.out.println("- " + fruit);
        }
    }
}

