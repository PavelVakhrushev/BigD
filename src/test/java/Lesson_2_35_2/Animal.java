package Lesson_2_35_2;

/* Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.

Создать в классе Животное статическое поле планета = Земля;
        Вывести на экран данное поле.
        Заменить это поле на Луна
        У созданной кошки вывести данное поле. */

public class Animal {
    static String planet = "Земля";

    public Animal(String planet) {
    }

    public static void testStaticMethod() {
        System.out.println("Это статическое животное");
    }

    public String getPlanet(String planet) {
        return planet;
    }

    public void setPlanet(String planet) {
        Animal.planet = planet;
    }

    public String toString() {
        return planet;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(planet);
        System.out.println(cat);
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        testStaticMethod();
        cat.setPlanet("Луна");
        System.out.println(cat);

    }
}
