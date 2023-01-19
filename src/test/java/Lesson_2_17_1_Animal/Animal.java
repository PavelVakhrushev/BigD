package Lesson_2_17_1_Animal;

public abstract class Animal {
    String name;
    String food;
    double foodCounter;
    String location;
    static int counter = 0;
    HealthState health;

    public HealthState getHealth() {
        return health;
    }

    public void setHealth(HealthState health) {
        this.health = health;
    }

    void makeSound() {
        System.out.println("Голос!");
    }

    void eat(double eatFood) {
        foodCounter = foodCounter - eatFood;

    }

    void sleep() {
        System.out.println(name + " спит.");
    }


    public String toString() {
        return "Страна обитания: " + location + "\nСостояние здоровья: " + health +
                "\nКоличество особей: " + counter;
    }

    public Animal(String name, double foodCounter, String location, HealthState health) {
        this.name = name;
        this.foodCounter = foodCounter;
        this.location = location;
        this.health = health;
        counter++;
    }

}
