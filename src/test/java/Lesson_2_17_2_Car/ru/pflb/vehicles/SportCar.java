package Lesson_2_17_2_Car.ru.pflb.vehicles;

import Lesson_2_17_2_Car.ru.pflb.details.Engine;
import Lesson_2_17_2_Car.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity; //максимальная скорость в км/ч

    @Override
    public String toString() {
        return super.toString() + "\nМаксимальная скорость: " + maxVelocity + " км/ч";
    }
    // поправил VehicleClass для SportCar
    public SportCar(String model, int weight, Driver driver, Engine engine,
                    int maxVelocity) {
        super(model, VehicleClass.SPORTS_CAR, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }
}
