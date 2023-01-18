package Lesson_2_17_1_Animal;

public class Vet {
    String name;

    public Vet(String name) {
        this.name = name;
    }

    void treatAnimal(Animal animal) {
        if (animal.getHealth().equals(HealthState.HEALTHY)) {
            System.out.println("Животное здорово");
        } else {
            animal.setHealth(HealthState.UNHEALTHY);
            System.out.println("Животное вылечено");
        }

    }
}
