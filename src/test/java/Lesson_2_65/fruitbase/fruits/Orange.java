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

public class Orange extends Fruit {
    public Orange (){
        this.name = "Orange";
        weight = 15.5;
        price = BigDecimal.valueOf(78.65);
        this.freshness = Freshness.FRESH;
    }
}