package Lesson_2_17_2_Car.ru.pflb.vehicles;

import Lesson_2_17_2_Car.ru.pflb.details.Engine;
import Lesson_2_17_2_Car.ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount; // грузоподъемность в киллограммах

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + loadingAmount + " кг.";
    }
    // поправил VehicleClass для Lorry
    public Lorry(String model, int weight, Driver driver, Engine engine,
                 int loadingAmount) {
        super(model, VehicleClass.MEDIUM, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }
}
