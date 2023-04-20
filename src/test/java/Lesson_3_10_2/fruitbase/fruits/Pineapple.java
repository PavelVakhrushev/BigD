package Lesson_3_10_2.fruitbase.fruits;

/* - классы видов фруктов в пакете с классом Fruit
    находятся в пакете com.fruitbase.fruits
    Apple
    Orange
    Banana
    Pineapple
    Каждый класс наследуется от Fruit
    В конструкторе класса устанавливаются значения веса, цены, названия для фрукта*/

import java.io.Serializable;
import java.math.BigDecimal;

public class Pineapple extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Pineapple() {
        name = "Pineapple";
        weight = 55.5;
        price = BigDecimal.valueOf(635.26);
        freshness = Freshness.FRESH;
    }
}