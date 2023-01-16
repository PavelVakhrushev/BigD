package Lesson_2_15__Enum;

public class MainE {

    public static void main(String[] args) {
        WeekE week1 = new WeekE(1, 3, 4, 5, 6, 7, 8, 9);
        week1.print();
        System.out.println(" ");
        WeekE week20 = new WeekE(20, 16, 17, 18, 19, 20, 21, 22);
        week20.print();
        System.out.println(" ");
        WeekE week47 = new WeekE(47, 21, 22, 23, 24, 25, 26, 27);
        week47.print();
    }
}
