package Lesson_2_65.fruitbase.fruits;

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
        super(0.3, BigDecimal.valueOf(500.00), "apple", Freshness.FRESH);
    }
}