package Lesson_3_10_2.fruitbase;

/* - класс Cargo
    находится в пакете com.fruitbase
    содержит поле массив Fruit - записи о фруктах, добавленных в груз
    содержит консткрутор без параметров
        в нем инициализируется внутренний массив
    содержит общедоступный метод getWeight - возвращает суммарный вес груза
    содержит общедоступный метод getPrice - возвращает суммарную цену груза
    содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив

    В класс Cargo надо добавить
    - общедоступный метод getFruits
      с его помощью покупатели получают фрукты из груза
      возвращает список фруктов

    - общедоступный метод removeFruit
      получает в качестве параметра фрукт
      если такого фрукта нет во внутреннем списке, то метод завершается
      иначе убирает фрукт с указанным названием из внутреннего массива и возвращает его*/

import Lesson_3_10_2.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {
    ArrayList<Fruit> fruits = new ArrayList<>();
    private int totalWeight = 0;
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private int removedWeight = 0;
    private BigDecimal removedPrice = BigDecimal.ZERO;

    public int getTotalWeight() {
        return totalWeight;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public int getRemovedWeight() {
        return removedWeight;
    }

    public BigDecimal getRemovedPrice() {
        return removedPrice;
    }

    void addFruit(Fruit fruit) {
        fruits.add(fruit);
        totalWeight += fruit.getWeight();
        totalPrice = totalPrice.add(fruit.getPrice());
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void removeFruits(List<Fruit> selectedFruits) {
        fruits.removeIf(selectedFruits::contains);
        for (Fruit fruit : selectedFruits) {
            removedWeight += fruit.getWeight();
            removedPrice = removedPrice.add(fruit.getPrice());
        }
    }
}

