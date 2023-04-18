package Lesson_3_10_2.fruitbase.fruits;

/* - классы видов фруктов в пакете с классом Fruit
    находятся в пакете com.fruitbase.fruits
    Apple
    Orange
    Banana
    Pineapple
    Каждый класс наследуется от Fruit
    В конструкторе класса устанавливаются значения веса, цены, названия для фрукта*/

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple() {
        name = "Apple";
        weight = 10.54;
        price = BigDecimal.valueOf(500);
        freshness = Freshness.FRESH;
    }
}