package Lesson_2_65.fruitbase;

/* - класс Cargo
    находится в пакете com.fruitbase
    содержит поле массив Fruit - записи о фруктах, добавленных в груз
    содержит консткрутор без параметров
        в нем инициализируется внутренний массив
    содержит общедоступный метод getWeight - возвращает суммарный вес груза
    содержит общедоступный метод getPrice - возвращает суммарную цену груза
    содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив*/

import Lesson_2_65.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    private Fruit[] fruits;
    private int[] counts;

    Cargo() {
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

    public Fruit[] getFruits() {
        Fruit[] result = new Fruit[fruits.length];
        System.arraycopy(fruits, 0, result, 0, fruits.length);
        return result;
    }

    public Fruit removeFruit(Fruit fruit) {
        int index = -1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getName().equals(fruit.getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return null;
        }
        Fruit result = fruits[index];
        if (counts[index] > 1) {
            counts[index]--;
        } else {
            //fruits = ArrayUtils.remove(fruits, index);
            //counts = ArrayUtils.remove(counts, index);
        }
        return result;
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
        sb.append("Общий вес: ").append(getWeight()).append(" кг." + "\n");
        sb.append("Итоговая стоимость: ").append(getPrice());
        return sb.toString();
    }
}


