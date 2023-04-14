package Lesson_2_65.fruitbase.customers;

/* Надо создать новый пакет customers и в нем создать новые классы
    - абстрактный класс Customer
        имеет внутренний массив покупок фруктов purchases (доступен у наследников)
        имеет внутреннее поле name - имя покупателя (доступен у наследников)
        имеет конструктор
            инициализируется внутренний массив
            устанавливается имя
        имеет метод takeFruits, который должны реализовать наследникик
            метод принимает груз и сохраняет из него фрукты во внутренний массив, т.е. в грузе объекты заканчиваются.
        имеет метод printPurchases
            метод выводит полученные фрукты
    Для этого класса мы создадим две реализации:
    - FreshCustomer
        реалиация метода takeFruits
            выбираются только свежие фрукты
    - UniqueCustomer
        реалиация метода takeFruits
            отбирает только уникальные фрукты, т.е. те, которых еще нет во внутреннем массиве */

import Lesson_2_65.fruitbase.Cargo;
import Lesson_2_65.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    protected List<Fruit> purchases;
    protected String name;

    Customer(String name) {
        this.name = name;
        purchases = new ArrayList<>();
    }

    public abstract List<Fruit> takeFruits(Cargo cargo);

    public void printPurchases() {
        if (purchases.isEmpty()) {
            System.out.println(name + " пока ничего не покупал.");
        } else {
            System.out.println(name + " купил:");
            for (Fruit fruit : purchases) {
                System.out.println(fruit.getName());
            }
            System.out.println();
        }
    }
}
