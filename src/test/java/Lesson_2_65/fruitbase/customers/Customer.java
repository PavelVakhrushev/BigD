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

public abstract class Customer {
    protected Fruit[] purchases;
    protected int numOfPurchases;
    protected String name;

    public Customer(String name) {
        this.purchases = new Fruit[10]; // начальный размер внутреннего массива 10
        this.numOfPurchases = 0;
        this.name = name;
    }

    public abstract void takeFruits(Cargo cargo);

    public String printPurchases() {
        System.out.println(name + " купил:");
        for (int i = 0; i < numOfPurchases; i++) {
            System.out.println(purchases[i]);
        }
        return null;
    }
}
