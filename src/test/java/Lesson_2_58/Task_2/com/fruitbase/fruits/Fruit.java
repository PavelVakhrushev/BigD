package Lesson_2_58.Task_2.com.fruitbase.fruits;

/* - абстрактный класс Fruit
    находится в пакете com.fruitbase.fruits
    содержит наследуемое поле вес
    содержит наследуемое поле цена
    содержит наследуемое поле name
    содержит общедоступный метод по-умолчанию для получения значения веса getWeight
    содержит общедоступный метод по-умолчанию для получения значения цены getPrice
    содержит общедоступный метод по-умолчанию для получения значения цены getName*/


import java.math.BigDecimal;

public abstract class Fruit {
    private double weight;
    private BigDecimal price;
    private String name;

    public Fruit(double weight, BigDecimal price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
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
}
