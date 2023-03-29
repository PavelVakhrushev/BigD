package Lesson_2_65.fruitbase;

/*  Также добавим специальный класс Simulation, внутри которого теперь будет выполняться программа.
    Для этого в него перенесем метод main из Fruitbase и внесем изменения:
    - после создания объекта FruitBase создается массив покупателей, в который будут входит экземпляры обоих видов
    покупателей
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

import java.awt.*;

public class Simulation {
    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase(); // создаем новую фруктовую базу

        // создаем массив покупателей
        Customer[] customers = new Customer[] {new FreshCustomer("Василий"), new UniqueCustomer("Анна")};

        for (Customer customer : customers) {
            // выполняем заказ и формируем груз
            Cargo cargo = fruitBase.takeOrder(customer.printPurchases());

            // выводим информацию о грузе
            System.out.println("Груз: " + cargo);

            // покупатель выбирает из груза интересующие его фрукты
            String selectedFruits = customer.printPurchases();

            // покупатель выводит полученные фрукты
            System.out.println("Выбранные фрукты: " + selectedFruits);

            // выводим информацию об оставшемся грузе
            System.out.println("Оставшийся груз: " + cargo);
        }
    }
}
