package Lesson_2_58.Task_2.com.fruitbase.fruits;

/* - классы видов фруктов в пакете с классом Fruit
    находятся в пакете com.fruitbase.fruits
    Apple
    Orange
    Banana
    Pineapple
    Каждый класс наследуется от Fruit
    В конструкторе класса устанавливаются значения веса, цены, названия для фрукта*/

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana() {
        super(0.3, BigDecimal.valueOf(0.8), "banana");
    }
}