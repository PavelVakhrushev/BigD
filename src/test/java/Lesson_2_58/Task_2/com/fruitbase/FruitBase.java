package Lesson_2_58.Task_2.com.fruitbase;

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import static Lesson_2_58.Task_2.com.fruitbase.FruitCatalogue.*;

public class FruitBase {

    static FruitCatalogue fruitCatalogue;

    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();

    }

    public static Cargo takeOrder(String order) {
        String[] orderItems = order.split(" ");
        Cargo cargo = new Cargo();
        // Поиск фруктов в каталоге
        for (String item : orderItems) {
            if (fruitCatalogue.contains(item)) {
                cargo.addFruit(fruitCatalogue.findFruit(fruitBase.toString()));

            }
        }

        // Если груз пустой, то создаем груз с нулевым количеством фруктов
        if (cargo.isEmpty()) {
            cargo = new Cargo();
        }
        return cargo;
    }

    public static void main(String[] args) {

        // Создаем фруктовую базу
        FruitCatalogue fruitCatalogue = new FruitCatalogue();

        // Проверяем наличие заказа от пользователя через аргумент строки
        if (args.length > 0) {
            // Если есть заказ, то он передается в метод takeOrder
            String order = args[0];
            String result = FruitBase.takeOrder(order).toString();

            // Выводим результат
            System.out.println(result);
        }
    }

}
