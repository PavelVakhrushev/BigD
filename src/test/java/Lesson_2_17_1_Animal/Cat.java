package Lesson_2_17_1_Animal;

public class Cat extends Animal {
    public Cat(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }


    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    void eat(double eatFood) {
        super.eat(eatFood);
        System.out.println(name + " ест корм для кошек");
        System.out.println("Запас корма: " + foodCounter + " кг");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
