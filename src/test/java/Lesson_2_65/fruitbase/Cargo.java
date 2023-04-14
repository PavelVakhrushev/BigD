package Lesson_2_65.fruitbase;

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

import Lesson_2_65.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Cargo {
    private List<Fruit> foundFruits;

    Cargo() {
        foundFruits = new ArrayList<>();
    }

    public double getWeight() {
        double sum = 0;
        for (Fruit foundFruit : foundFruits) {
            sum = sum + foundFruit.getWeight();
        }
        return sum;
    }

    public BigDecimal getPrice() {
        BigDecimal totalPrice = new BigDecimal(0);
        for (Fruit foundFruit : foundFruits) {
            totalPrice = totalPrice.add(foundFruit.getPrice());
        }
        return totalPrice;
    }


    public void addFruit(Fruit fruit) {
        List<Fruit> newFoundFruits = new ArrayList<>(foundFruits);
        newFoundFruits.add(fruit);
        foundFruits = newFoundFruits;
    }

    public List<Fruit> getFruits() {
        return foundFruits;
    }

    public void removeFruits(List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            foundFruits.remove(fruit);
        }
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Fruit currentCargoFruit : foundFruits) {
            s.append(currentCargoFruit.getName()).append(" ");
        }
        String weight = String.format("%.2f", this.getWeight());
        return "Информация о грузе(" + foundFruits.size() + "): " + s + "\n" +
                "Вес: " + weight + "  " + "Цена: " + this.getPrice();
    }

}

