package Lesson_2_35_2;

/* Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.

Создать в классе Животное статическое поле планета = Земля;
        Вывести на экран данное поле.
        Заменить это поле на Луна
        У созданной кошки вывести данное поле. */

import static Lesson_2_35_2.Cat.testStaticMethod;

public class Animal {
    static String planet = "Земля";

    public String getPlanet() {
        return planet;
    }

    public String setPlanet(String planet) {
        planet = "Луна";
        return planet;
    }


    public Animal(String planet) {

    }

    public String toString() {
        return planet;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        testStaticMethod();
        Lesson_2_35_2.Cat.testStaticMethod();
        testStaticMethod();

        Animal planet3 = new Animal(planet);
        System.out.println(planet3.setPlanet("luna"));


        Animal planet2 = new Animal(planet);
        System.out.println(planet2);
    }
}
