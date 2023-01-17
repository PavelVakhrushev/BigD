package Lesson_2_17_1_Animal;

public class Dog extends Animal {
    Dog(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }

    public Dog(){

    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
