package Lesson_2_17_2_Car.ru.pflb.vehicles;

import Lesson_2_17_2_Car.ru.pflb.details.Engine;
import Lesson_2_17_2_Car.ru.pflb.professions.Driver;

public class Car {
    String model; //название модели автомобиля
    VehicleClass vehicleClass; // класc автомобиля типа vehicleClass
    int weight; // вес автомобиля в килограммах
    Driver driver; //водитель, за которым закреплен автомобиль
    Engine engine; // тип мотора типа Engine

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public String toString() {
        return "Модель: " + model + " \nКласс: " + vehicleClass +
                "\nХарактеристики: " +
                "\nвес: " + weight +
                "\nдвигатель: " + engine +
                "\nВодитель: " + driver;
    }

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
}

