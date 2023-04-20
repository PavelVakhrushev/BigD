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

public class Orange extends Fruit implements Serializable {
    private static final long serialVersionUID = 1L;

    public Orange() {
        name = "Orange";
        weight = 40.5;
        price = BigDecimal.valueOf(578.00);
        freshness = Freshness.FRESH;
    }
}