package Lesson_2_58.Task_2.com.fruitbase;

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public class FruitBase {

    private static Fruit[] fruits;

    public FruitBase(Fruit[] fruits) {
        FruitBase.fruits = fruits;
    }


    public void processQuery(String[] query) {
        int[] cargo = new int[fruits.length];

        for (String fruitName : query) {
            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i].getName().equals(fruitName)) {
                    cargo[i]++;
                }
            }
        }

        double totalWeight = 0.0;
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (int i = 0; i < fruits.length; i++) {
            if (cargo[i] > 0) {
                Fruit fruit = fruits[i];
                int count = cargo[i];
                double weight = fruit.getWeight() * count;
                BigDecimal price = fruit.getPrice().multiply(BigDecimal.valueOf(count));

                System.out.printf("%s x%d: %.2f kg, $%.2f\n", fruit.getName(), count, weight, price);

                totalWeight += weight;
                totalPrice = totalPrice.add(price);
            }
        }

        System.out.printf("Total weight: %.2f kg\n", totalWeight);
        System.out.printf("Total price: $%.2f\n", totalPrice);
    }

    public static void main(String[] args) {
        FruitBase base = new FruitBase(fruits);

        if (args.length > 0) {
            base.processQuery(args);
        } else {
            System.out.println("No query");
        }
    }
}




