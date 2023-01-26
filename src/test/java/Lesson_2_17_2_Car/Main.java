package Lesson_2_17_2_Car;

import Lesson_2_17_2_Car.ru.pflb.details.Engine;
import Lesson_2_17_2_Car.ru.pflb.professions.Driver;
import Lesson_2_17_2_Car.ru.pflb.vehicles.Car;
import Lesson_2_17_2_Car.ru.pflb.vehicles.Lorry;
import Lesson_2_17_2_Car.ru.pflb.vehicles.SportCar;
import Lesson_2_17_2_Car.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Driver driverCar = new Driver(30, "Николай", 10, 99445566);
        Driver driverLorry = new Driver(35, "Валерий", 15, 99554455);
        Driver driverSportCar = new Driver(40, "Михаил", 20, 99558877);

        Engine engineCar = new Engine(200, "Автоваз");
        Engine engineLorry = new Engine(500, "ЯМЗ");
        Engine engineSportCar = new Engine(600, "Митсубиси");


        Car car1 = new Car("Гранта", VehicleClass.SMALL, 1500, driverCar, engineCar);
        Lorry lorry1 = new Lorry("KAMAZ", 5000, driverLorry, engineLorry,
                10000);
        SportCar sportCar1 = new SportCar("Lancer", 2000, driverSportCar,
                engineSportCar, 300);


        System.out.println();
        System.out.println(car1.toString());
        System.out.println();
        System.out.println(sportCar1.toString());
        System.out.println();
        System.out.println(lorry1.toString());
        System.out.println();
        lorry1.turnLeft();
        sportCar1.turnRight();
        car1.start();
        car1.stop();
    }

}
