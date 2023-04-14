package Lesson_2_65.fruitbase.fruits;

/* - абстрактный класс Fruit
    находится в пакете com.fruitbase.fruits
    содержит наследуемое поле вес
    содержит наследуемое поле цена
    содержит наследуемое поле name
    содержит общедоступный метод по-умолчанию для получения значения веса getWeight
    содержит общедоступный метод по-умолчанию для получения значения цены getPrice
    содержит общедоступный метод по-умолчанию для получения значения цены getName

    Для фруктов нужно добавить
        - внутренний параметр freshness - отражает состояние свежести фрукта;
          для значений нужно завести enum с как минимум состояниями: FRESH, OVERRIPED, SPOILED
          при создании объект имеет состояние FRESH
        - метод equals
        - метод hashcode
        - метод isFresh - возвращает true, если параметр freshness имеет состояние FRESH
    */

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;
    protected Freshness freshness;

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit that = (Fruit) o;
        if (freshness != that.freshness) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name)
                && Objects.equals(price, fruit.price)
                && Objects.equals(weight, fruit.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight, freshness);
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;

    }
}
