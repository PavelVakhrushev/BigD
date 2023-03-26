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

public abstract class Customer {
    protected String[] purchases;
    protected String name;
    protected int index;

    public Customer(String name) {
        this.name = name;
        purchases = new String[10];
        index = 0;
    }

    public abstract void takeFruits(String[] fruits);

    public void printPurchases() {
        System.out.println("Customer " + name + " purchased:");
        for (int i = 0; i < index; i++) {
            System.out.println("- " + purchases[i]);
        }
    }
}
