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
import Lesson_2_65.fruitbase.customers.freshCustomer;
import Lesson_2_65.fruitbase.customers.uniqueCustomer;
import Lesson_2_65.fruitbase.fruits.Fruit;

import java.util.List;

public class Simulation {
    public static void main(String[] args) {

        if (args.length > 0) {

            FruitBase fruitBase = new FruitBase();
            Customer[] customers = {new freshCustomer("Покупатель свежих фруктов"),
                    new uniqueCustomer("Покупатель уникальных фруктов")};
            for (Customer customer : customers) {
                System.out.print("Информация по грузу:" + "\n");
                Cargo cargo = fruitBase.takeOrder(args);
                System.out.println("Вес заказа, всего: " + cargo.getTotalWeight() + " кг.");
                System.out.println("Стоимость заказа, всего: " + cargo.getTotalPrice() + " у.е." + "\n");
                List<Fruit> selectedFruits = customer.takeFruits(cargo);
                cargo.removeFruits(selectedFruits);
                customer.printPurchases();
                System.out.println("Оставшийся груз: ");
                System.out.println("Вес оставшегося груза: " +
                        (cargo.getTotalWeight() - cargo.getRemovedWeight()) + " кг.");
                System.out.println("Стоимость оставшегося груза: " +
                        (cargo.getTotalPrice().subtract(cargo.getRemovedPrice())) + " у.е." + "\n");
            }

        } else {
            System.out.println("В заказ ничего не добавлено!");
        }
    }
}
