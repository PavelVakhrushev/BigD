package Lesson_2_35_2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String planet) {
        super(planet);
    }

    public static void testStaticMethod() {
        System.out.println("Это статическое животное");
    }
}
