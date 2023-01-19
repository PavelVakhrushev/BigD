package Lesson_2_17_2_Car.ru.pflb.details;

public class Engine {
    int power; // значение мощности двигателя в ваттах
    String vendor; // название производителя

    public String toString() {
        return "\nПроизводитель: " + vendor + "\nМощность: " + power + "л.с.";
    }

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }
}
