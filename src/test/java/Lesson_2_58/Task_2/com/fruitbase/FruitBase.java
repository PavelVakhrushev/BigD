package Lesson_2_58.Task_2.com.fruitbase;

import Lesson_2_58.Task_2.com.fruitbase.fruits.Fruit;

import static Lesson_2_58.Task_2.com.fruitbase.FruitCatalogue.fruitBase;

public class FruitBase {

    static FruitCatalogue fruitCatalogue;

    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();

    }

    public static Cargo takeOrder(String order) {
        String[] args = order.split(" ");
        Cargo cargo = new Cargo();
        // Поиск фруктов в каталоге
        for (String arg : args) {
            Fruit fruit = fruitBase.findFruit(arg);
            if (fruit != null) {
                // Если фрукт найден, то добавляем его в груз
                cargo.addFruit(fruit);
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
