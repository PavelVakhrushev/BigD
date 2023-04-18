package Lesson_3_10_2.fruitbase;

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


import Lesson_3_10_2.fruitbase.customers.Customer;
import Lesson_3_10_2.fruitbase.customers.FreshCustomer;
import Lesson_3_10_2.fruitbase.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {
        if (args.length > 0) {
            FruitBase fruitBase = new FruitBase();
            Customer[] customers = {new FreshCustomer("Покупатель свежих фруктов"),
                    new UniqueCustomer("Покупатель уникальных фруктов")};
            for (Customer customer : customers) {
                System.out.print("Информация по грузу:" + "\n");
                Cargo cargo = fruitBase.takeOrder(args);
                System.out.println("Общий вес заказа: " + cargo.getTotalWeight() + " кг");
                System.out.println("Общая стоимость заказа: " + cargo.getTotalPrice() + " у.е." + "\n");
                customer.takeFruits(cargo);
                customer.printPurchases();
                System.out.println("Информация об оставшемся грузе: ");
                System.out.println("Вес оставшегося груза: " +
                        (cargo.getTotalWeight() - cargo.getRemovedWeight()) + " кг");
                System.out.println("Сумма оставшегося груза: " +
                        (cargo.getTotalPrice().subtract(cargo.getRemovedPrice())) + " у.е." + "\n");
            }
        } else System.out.println("В заказ ничего не добавлено!");

    }
}
