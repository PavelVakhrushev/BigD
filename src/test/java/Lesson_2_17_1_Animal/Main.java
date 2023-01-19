package Lesson_2_17_1_Animal;

import static Lesson_2_17_1_Animal.HealthState.*;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Гром", 20, "Россия", HEALTHY);
        Cat cat1 = new Cat("Молния", 80, "Россия", HEALTHY);
        Horse horse1 = new Horse("Резкий", 140, "Арабские Эмираты", UNHEALTHY);
        Vet vet1 = new Vet("Сергей Сергеев");

        dog1.makeSound();
        dog1.eat(8.2);
        System.out.println(dog1);
        vet1.treatAnimal(dog1);
        dog1.sleep();
        System.out.println();

        cat1.makeSound();
        cat1.eat(6.9);
        System.out.println(cat1);
        vet1.treatAnimal(cat1);
        System.out.println();

        horse1.makeSound();
        horse1.eat(10.5);
        System.out.println(horse1);
        vet1.treatAnimal(horse1);
        horse1.sleep();
    }
}
