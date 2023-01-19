package Lesson_2_17_2_Car.ru.pflb;

public abstract class Person {
    int age; //возраст в годах
    String name; //строка с ФИО

    public String toString() {
        return name + " " + age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
