package Lesson_2_35_1;
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

    Cat(int ageCat, String colorEyeCat) {
        this.ageCat = ageCat;
        this.colorEyeCat = colorEyeCat;
    }

    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменных


    Cat (int ageCat, String colorWoolCat) {
        this. ageCat = ageCat;
        this.colorWoolCat = colorWoolCat;
    }
    */
    Cat(int ageCat, double weightCat) {
        this.ageCat = ageCat;
        this.weightCat = weightCat;
    }

    Cat(String colorEyeCat, int ageCat) {
        this.colorEyeCat = colorEyeCat;
        this.ageCat = ageCat;
    }

    Cat(String colorEyeCat, double weightCat) {
        this.colorEyeCat = colorEyeCat;
        this.weightCat = weightCat;
    }

    Cat(String colorEyeCat, String colorWoolCat) {
        this.colorEyeCat = colorEyeCat;
        this.colorWoolCat = colorWoolCat;
    }
    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменных

    Cat(String colorWoolCat, String colorEyeCat) {
        this.colorWoolCat =colorWoolCat;
        this.colorEyeCat = colorEyeCat;
    }
     */

    Cat(double weightCat, int ageCat) {
        this.weightCat = weightCat;
        this.ageCat = ageCat;
    }

    Cat(double weightCat, String colorEyeCat) {
        this.weightCat = weightCat;
        this.colorEyeCat = colorEyeCat;
    }

    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменных

    Cat(double weightCat, String colorWoolCat) {
        this.weightCat = weightCat;
        this.colorWoolCat = colorWoolCat;

    }
    */

    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменных

    Cat (String colorWoolCat, int ageCat) {
        this.colorWoolCat = colorWoolCat;
        this.ageCat = ageCat;
    }
    */
    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменных


    Cat (String colorWoolCat, double weightCat) {
        this.colorWoolCat = colorWoolCat;
        this.weightCat = weightCat;
    }
    */
    Cat(int ageCat) {
        this.ageCat = ageCat;
    }

    Cat(double weightCat) {
        this.weightCat = weightCat;
    }

    Cat(String colorEyeCat) {
        this.colorEyeCat = colorEyeCat;
    }

    /* конструктор с colorWoolCat с точки зрения java схожий с конструктором colorEyeCat т.к
   java не может определить к какому String даётся значение переменной


    Cat(String colorWoolCat) {
       this.colorWoolCat = colorWoolCat;
   }
   */

    public String toString() {
        return "количество лет: " + ageCat +
                "\nцвет глаз: " + colorEyeCat +
                "\nвес котика: " + weightCat +
                "\nцвет шерсти: " + colorWoolCat + '\n';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(5, 6.0);
        Cat cat2 = new Cat("зеленый", 3.5);
        Cat cat3 = new Cat("оранжевый", "белый");
        Cat cat4 = new Cat(4.2, 2);
        Cat cat5 = new Cat(5.5, "серая дымка");
        Cat cat6 = new Cat(7);
        Cat cat7 = new Cat(5.6);
        Cat cat8 = new Cat("синий");
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
