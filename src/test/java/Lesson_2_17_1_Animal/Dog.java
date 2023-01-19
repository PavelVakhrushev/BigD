package Lesson_2_17_1_Animal;

public class Dog extends Animal {
    public Dog(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }


    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    void eat(double eatFood) {
        super.eat(eatFood);
        System.out.println(name + " ест корм для собак");
        System.out.println("Запас корма: " + foodCounter + " кг");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
