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

public abstract class Fruit {
    double weight;
    BigDecimal price;
    String name;

    Freshness freshness; // добавляем поле для состояния свежести фрукта

    public Fruit(double weight, BigDecimal price, String name, Freshness freshness) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.freshness = Freshness.FRESH;
    }

    public double getWeight() {
        return this.weight;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Freshness getFreshness() {
        return this.freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;

    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Fruit other)) return false;

        return Double.compare(weight, other.weight) == 0 &&
                price.equals(other.price) &&
                name.equals(other.name) &&
                freshness == other.freshness;
    }

    public int hashCode() {
        int result = 17;
        long weightBits = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (weightBits ^ (weightBits >>> 32));
        result = 31 * result + price.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + freshness.hashCode();
        return result;
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

}
