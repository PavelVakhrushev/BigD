package Lesson_2_65.fruitbase;

/* - класс FruitCatalogue
    находится в пакете com.fruitbase
    содержит поле массив Fruit - список записей известных фруктов
    содержит конструктор без параметров
        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
    содержит метод findFruit, доступный только в пакете
        по переданному слову проверяет есть ли информация о таком фрукте
        если есть, то возвращает Fruit. Если нет, то возвращает null.*/

import Lesson_2_65.fruitbase.fruits.*;

class FruitCatalogue {
    private Fruit[] fruits;

    public FruitCatalogue() {
        this.fruits = new Fruit[]{new Apple(), new Orange(), new Banana(), new Pineapple()};
    }

    Fruit findFruit(String name) {
        for (Fruit fruit : this.fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }
}