package Lesson_2_65.fruitbase;

/* - класс FruitBase
    находится в пакете com.fruitbase
    содержит поле FruitCatalogue
    содержит конструктор без параметров
        в нем инициализируется поле FruitCatalogue
    содержит общедоступный метод для обработки заказа takeOrder
        в этом методе происходит поиск слов из заказа в FruitCatalogue
        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
        Если среди запроса не встретились известные названия,
        то возвращается груз Cargo с нулевым количеством фруктов
    содержит метод main
        здесь происходит выполнение программы согласно описанию выше
        основные шаги:
            создается фруктовая база
            проверяется наличие заказа от пользователя
            если есть заказ, то он передается в метод takeOrder
            выводим результат*/

import Lesson_2_65.fruitbase.fruits.Fruit;

public class FruitBase {

    private final FruitCatalogue fruitCatalogue;

    public FruitBase() {  // конструктор без параметров
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String... orderFruits) {
        Cargo cargo = new Cargo(); // создаем новый груз
        for (String orderFruit : orderFruits) {
            Fruit fruit = fruitCatalogue.findFruit(orderFruit); // ищем фрукт по его названию
            if (fruit != null) { // если фрукт найден
                cargo.addFruit(fruit); // добавляем его в груз
            }
        }
        return cargo; // возвращаем груз со всеми найденными фруктами
    }
}
