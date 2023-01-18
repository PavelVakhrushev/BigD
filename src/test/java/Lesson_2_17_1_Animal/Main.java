package Lesson_2_17_1_Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Гром", 20, "Россия", HealthState.HEALTHY);
        Cat cat1 = new Cat("Молния", 80, "Россия", HealthState.HEALTHY);
        Horse horse1 = new Horse("Резкий", 140, "Арабские Эмираты", HealthState.UNHEALTHY);
        Vet vet1 = new Vet("Сергей Сергеев");

        System.out.println("Что говорит: ");
        dog1.makeSound();
        System.out.println("Что делает: ");
        dog1.sleep();
        System.out.println();
        dog1.eat(8);
        System.out.println();
        System.out.println(dog1);
        System.out.println();
        vet1.treatAnimal(dog1);
        System.out.println();
        cat1.makeSound();
        System.out.println();
        cat1.sleep();
        System.out.println();
        cat1.eat(6);
        System.out.println();
        System.out.println(cat1);
        System.out.println();
        vet1.treatAnimal(cat1);
        System.out.println();

        horse1.makeSound();
        System.out.println();
        horse1.sleep();
        System.out.println();
        horse1.eat(10);
        System.out.println();
        System.out.println(horse1);
        System.out.println();
        vet1.treatAnimal(horse1);
        System.out.println();
        System.out.println(horse1);
    }
}
