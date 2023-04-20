package Lesson_3_10_2.fruitbase;

/* - класс FruitBase
    находится в пакете com.fruitbase
    содержит поле FruitCatalogue
    содержит конструктор без параметров
        в нем инициализируется поле FruitCatalogue
    содержит общедоступный метод для обработки заказа takeOrder
        в этом методе происходит поиск слов из заказа в FruitCatalogue
        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
        Если среди запроса не встретились известные названия,
        то возвращается груз Cargo с нулевым количеством фруктов
    содержит метод main
        здесь происходит выполнение программы согласно описанию выше
        основные шаги:
            создается фруктовая база
            проверяется наличие заказа от пользователя
            если есть заказ, то он передается в метод takeOrder
            выводим результат*/

import Lesson_3_10_2.fruitbase.fruits.Fruit;

import java.io.*;

public class FruitBase implements Serializable {
    private static final long serialVersionUID = 1L;

    FruitCatalogue fruitCatalogue;

    FruitBase() {
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] orderFruits) {
        Cargo cargo = new Cargo();
        for (String orderFruit : orderFruits) {
            Fruit f = fruitCatalogue.findFruit(orderFruit);
            if (f != null) {
                cargo.addFruit(f);
                System.out.println(f.getName());
            }
        }
        return cargo;
    }

    public void exportCatalogue(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fruitCatalogue);
            out.close();
            fileOut.close();
            System.out.println("Каталог экспортирован");
            System.out.println(fruitCatalogue); //для проверки значений
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importCatalogue(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            fruitCatalogue = (FruitCatalogue) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Каталог импортирован");
            System.out.println(fruitCatalogue); //для проверки значений
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}