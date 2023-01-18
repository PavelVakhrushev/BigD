package Lesson_2_17_1_Animal;

public class Cat extends Animal {
    public Cat(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }

    public Cat() {

    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
