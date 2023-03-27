package Lesson_2_65.fruitbase;

/*  Также добавим специальный класс Simulation, внутри которого теперь будет выполняться программа.
    Для этого в него перенесем метод main из Fruitbase и внесем изменения:
    - после создания объекта FruitBase создается массив покупателей, в который будут входит экземпляры обоих видов покупателей
    - далее для каждого покупателя:
        выполняется заказ и формируется груз
        выводится информации о грузе
        покупатель выбирает из груза интересующие его фрукты
        покупатель выводит полученные фрукты
        выводится информации об оставшемся грузе*/

import Lesson_2_65.fruitbase.customers.Customer;
import Lesson_2_65.fruitbase.customers.FreshCustomer;
import Lesson_2_65.fruitbase.customers.UniqueCustomer;
import Lesson_2_65.fruitbase.fruits.Fruit;

public class Simulation {
    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase(); // создаем новую фруктовую базу
        Customer[] customers = {new FreshCustomer("Толя"), new UniqueCustomer("Коля")}; // создаем массив покупателей

        for (Customer customer : customers) { // для каждого покупателя:
            Cargo cargo = fruitBase.takeOrder(args); // выполняем заказ и формируем груз
            System.out.println("\nЗаказ для " + customer.getClass().getSimpleName() + ":");
            System.out.println(cargo); // выводим информацию о грузе

            Fruit[] selectedFruits = cargo.getFruits(); // покупатель выбирает фрукты из груза
            System.out.println("\nПолученные фрукты для " + customer.getClass().getSimpleName() + ":");
            for (Fruit fruit : selectedFruits) { // выводим полученные фрукты
                System.out.println(fruit);
            }

            cargo.removeFruit("berries"); // удаляем выбранные фрукты из груза
            System.out.println("\nОставшиеся фрукты в грузе для " + customer.getClass().getSimpleName() + ":");
            System.out.println(cargo); // выводим информацию об оставшемся грузе
        }

        if (args.length == 0) { // если заказ был пустой
            System.out.println("В заказ ничего не добавлено!");
        }
    }

}
