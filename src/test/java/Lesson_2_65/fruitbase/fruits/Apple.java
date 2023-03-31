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
    public Apple (){
        this.name = "Apple";
        weight = 5.54;
        price = BigDecimal.valueOf(75);
        this.freshness = Freshness.FRESH;
    }
}