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

public class Banana extends Fruit {
    public Banana (){
        this.name = "Banana";
        weight = 12.8;
        price = BigDecimal.valueOf(26.35);
        this.freshness = Freshness.OVERRIPED;
    }
}