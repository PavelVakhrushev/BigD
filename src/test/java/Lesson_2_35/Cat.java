package Lesson_2_35;
/* Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
Создать максимально возможное количество конструкторов, создать котиков в методе Main и вывести на их экран.
Не забываем про метод toString() для котов.*/


public class Cat {
    int ageCat;
    String colorEyeCat;
    double weightCat;
    String colorWoolCat;

    public Cat() {

    }

    Cat(String colorWoolCat, int ageCat, double weightCat, String colorEyeCat) {
        this.colorWoolCat = colorWoolCat;
        this.ageCat = ageCat;
        this.weightCat = weightCat;
        this.colorEyeCat = colorEyeCat;
    }

    Cat(double weightCat, int ageCat, String colorWoolCat, String colorEyeCat) {
        this.weightCat = weightCat;
        this.ageCat = ageCat;
        this.colorWoolCat = colorWoolCat;
        this.colorEyeCat = colorEyeCat;
    }

    Cat(int ageCat, String colorEyeCat, String colorWoolCat, double weightCat) {
        this.ageCat = ageCat;
        this.colorEyeCat = colorEyeCat;
        this.colorWoolCat = colorWoolCat;
        this.weightCat = weightCat;
    }

    Cat(String colorEyeCat, double weightCat, int ageCat, String colorWoolCat) {
        this.colorEyeCat = colorEyeCat;
        this.weightCat = weightCat;
        this.ageCat = ageCat;
        this.colorWoolCat = colorWoolCat;
    }

    Cat(double weightCat, String colorWoolCat, String colorEyeCat) {
        this.weightCat = weightCat;
        this.colorWoolCat = colorWoolCat;
        this.colorEyeCat = colorEyeCat;
    }

    Cat(String colorEyeCat, int ageCat, String colorWoolCat) {
        this.colorEyeCat = colorEyeCat;
        this.ageCat = ageCat;
        this.colorWoolCat = colorWoolCat;
    }

    Cat(int ageCat, String colorEyeCat) {
        this.ageCat = ageCat;
        this.colorEyeCat = colorEyeCat;
    }

    Cat(String colorEyeCat, int ageCat) {
        this.colorEyeCat = colorEyeCat;
        this.ageCat = ageCat;
    }

    public String toString() {
        return "количество лет: " + ageCat +
                "\nцвет глаз: " + colorEyeCat +
                "\nвес котика: " + weightCat +
                "\nцвет шерсти: " + colorWoolCat + '\n';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("серый", 3, 5.5, "желтый");
        Cat cat2 = new Cat(5.2, 3, "коричневый", "зеленый");
        Cat cat3 = new Cat(4, "оранжевый", "белый", 3.3);
        Cat cat4 = new Cat("голубой", 4.2, 2, "черный");
        Cat cat5 = new Cat("желтый", 5, "серая дымка");
        Cat cat6 = new Cat(7.7, "черно-белый", "красный");
        Cat cat7 = new Cat(5, "зеленый");
        Cat cat8 = new Cat("синий", 6);
        Cat cat9 = new Cat();

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println(cat6);
        System.out.println(cat7);
        System.out.println(cat8);
        System.out.println(cat9);

    }

}
