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

import java.util.List;

public class Simulation {
    public static void main(String[] args) {

        if (args.length > 0) {

            FruitBase fruitBase = new FruitBase();
            Customer[] customers = {new FreshCustomer("Покупатель свежих фруктов"),
                    new UniqueCustomer("Покупатель уникальных фруктов")};
            for (int i = 0; i < customers.length; i++) {
                Cargo cargo = fruitBase.takeOrder(args);
                System.out.print("Груз до покупок: " + "\n");
                System.out.println("Вес, всего: " + cargo.getWeight() + " кг.");
                System.out.println("Стоимость, всего: " + cargo.getPrice() + " у.е." + "\n");
                customers[i].takeFruits(cargo);
                System.out.println("");
                System.out.print(customers[i] + " купил: ");
                customers[i].printPurchases();
                System.out.println("Груз после покупок: ");
                System.out.println(cargo);
                System.out.println("");
            }

        } else {
            System.out.println("В заказ ничего не добавлено!");
        }
    }
}
