package Lesson_2_58.Task_2.com.fruitbase;

/* - класс Cargo
    находится в пакете com.fruitbase
    содержит поле массив Fruit - записи о фруктах, добавленных в груз
    содержит консткрутор без параметров
        в нем инициализируется внутренний массив
    содержит общедоступный метод getWeight - возвращает суммарный вес груза
    содержит общедоступный метод getPrice - возвращает суммарную цену груза
    содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив*/

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    private Fruit[] fruits;
    private int[] counts;

    public Cargo() {
        fruits = new Fruit[0];
        counts = new int[0];
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < fruits.length; i++) {
            weight += fruits[i].getWeight() * counts[i];
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.valueOf(0);
        for (int i = 0; i < fruits.length; i++) {
            price = price.add(fruits[i].getPrice().multiply(BigDecimal.valueOf(counts[i])));
        }
        return price;
    }

    void addFruit(Fruit fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getName().equals(fruit.getName())) {
                counts[i]++;
                return;
            }
        }
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        fruits[fruits.length - 1] = fruit;
        counts = Arrays.copyOf(counts, counts.length + 1);
        counts[counts.length - 1] = 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fruits.length; i++) {
            sb.append(counts[i]).append(" ").append(fruits[i].getName()).append("\n");
        }
        sb.append("Total weight: ").append(getWeight()).append("\n");
        sb.append("Total price: ").append(getPrice());
        return sb.toString();
    }
}


