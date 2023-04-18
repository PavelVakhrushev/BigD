package fruitbase.fruits;

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
        name = "Banana";
        weight = 25.8;
        price = BigDecimal.valueOf(224.40);
        freshness = Freshness.SPOILED;
    }
}