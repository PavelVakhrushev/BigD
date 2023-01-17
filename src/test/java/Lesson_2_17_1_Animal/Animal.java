package Lesson_2_17_1_Animal;

public abstract class Animal {
    String name;
    String food;
    double foodCounter;
    String location;
    int counter = 0;
    HealthState health;

    public HealthState getHealth() {
        return health;
    }

    public void setHealth(HealthState health) {
        this.health = health;
    }

    abstract void makeSound();

    void eat(double eatFood) {
        System.out.println("Животное " + name + " ест корм." );
        foodCounter = foodCounter - eatFood;
        System.out.println("Остаток корма: " + foodCounter);
    }

    void sleep() {
        System.out.println(name + " спит.");
    }

    public String toString() {
        return "Страна обитания: " + location + "\nСостояние здоровья: " + health + "\nОбщее количество животных: " + counter;
    }

    public Animal(String name, String food, double foodCounter, String location, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.health = health;
        counter ++;
    }
    public Animal(String name, double foodCounter, String location, HealthState health) {
        this.name = name;
        this.foodCounter = foodCounter;
        this.location = location;
        counter ++;
    }

    public Animal() {
        counter ++;
    }

    public Animal(String name, double foodCounter, String location) {
        counter ++;
    }
}
