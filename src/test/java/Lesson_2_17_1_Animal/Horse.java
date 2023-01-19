package Lesson_2_17_1_Animal;

public class Horse extends Animal {
    public Horse(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }


    @Override
    public void makeSound() {
        System.out.println("И-го-го");
    }

    @Override
    void eat(double eatFood) {
        super.eat(eatFood);
        System.out.println(name + " ест сено");
        System.out.println("Запас сена: " + foodCounter + " кг");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
