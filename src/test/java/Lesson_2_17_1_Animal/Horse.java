package Lesson_2_17_1_Animal;

public class Horse extends Animal {

    Horse(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }

    public Horse() {

    }

    @Override
    public void makeSound() {
        System.out.println("И-го-го");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
