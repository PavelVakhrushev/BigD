package Lesson_2_13_1;
// Сделал задачу по условиям.
public class Circle_3 {
    public Circle_3(double radius) {
        this.radius = radius;
    }
    final double Pi = 3.14;
    double radius;

    double getArea()  {
        return radius*radius*Pi;
    }
    double getLength() {
        return 2*Pi*radius;
    }
    void printRadius () {
        System.out.println("Радиус = " + radius);
    }
    void printAreaLength() {
        System.out.println("Площадь круга = " + getArea());
        System.out.println("Длина окружности = " + getLength());
    }



    public static void main(String[] args) {
        Circle_3 c3 = new Circle_3(36);
        c3.printAreaLength();
        c3.printRadius();
    }
}
