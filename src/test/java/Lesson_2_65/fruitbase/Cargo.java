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
    private int size;

    public Cargo() {
        fruits = new Fruit[10];
        counts = new int[10];
        size = 0;
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < size; i++) {
            weight += fruits[i].getWeight() * counts[i];
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.valueOf(0);
        for (int i = 0; i < size; i++) {
            price = price.add(fruits[i].getPrice().multiply(BigDecimal.valueOf(counts[i])));
        }
        return price;
    }

    public void addFruit(Fruit fruit) {
        for (int i = 0; i < size; i++) {
            if (fruits[i].getName().equals(fruit.getName())) {
                counts[i]++;
                return;
            }
        }
        if (size == fruits.length) {
            fruits = Arrays.copyOf(fruits, fruits.length * 2);
            counts = Arrays.copyOf(counts, counts.length * 2);
        }
        fruits[size] = fruit;
        counts[size] = 1;
        size++;
    }

    public void removeFruit(String name) {
        for (int i = 0; i < size; i++) {
            if (fruits[i].getName().equals(name)) {
                counts[i]--;
                if (counts[i] == 0) {
                    double weight = fruits[i].getWeight();
                    for (int j = i; j < size - 1; j++) {
                        fruits[j] = fruits[j + 1];
                        counts[j] = counts[j + 1];
                    }
                    size--;
                    return;
                }
                return;
            }
        }
    }

    public Fruit[] getFruits() {
        Fruit[] result = new Fruit[size];
        System.arraycopy(fruits, 0, result, 0, size);
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(counts[i]).append(" ").append(fruits[i].getName()).append("\n");
        }
        sb.append("Общий вес: ").append(getWeight()).append(" кг." + "\n");
        sb.append("Итоговая стоимость: ").append(getPrice());
        return sb.toString();
    }
}

