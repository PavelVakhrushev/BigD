package Lesson_2_17_2_Car.ru.pflb.professions;

import Lesson_2_17_2_Car.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience;//кол-во целых лет опыта
    int licenseId; //номер водительского удостоверения

    @Override
    public String toString() {
        return getName() + ", возраст: " + getAge() + " лет" + "\nСтаж: " + drivingExperience + " лет" +
                "\nНомер удостоверения: " + licenseId;
    }

    public Driver(int age, String name, int drivingExperience, int licenseId) {
        super(age, name);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }
}
