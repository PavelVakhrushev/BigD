package Lesson_2_15_1;


import static Lesson_2_15_1.DaysOfWeek.*;

public class Week {

    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;

    int weekOfYear;


    public Week(int weekNum, int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        weekOfYear = weekNum;

        day1 = new Day(1, d1);
        day2 = new Day(2, d2);
        day3 = new Day(3, d3);
        day4 = new Day(4, d4);
        day5 = new Day(5, d5);
        day6 = new Day(6, d6);
        day7 = new Day(7, d7);

        System.out.println(weekNum + " неделя 2022 года:");
        System.out.println(day1 + " - " + d1 + " число");
        System.out.println(day2 + " - " + d2 + " число");
        System.out.println(day3 + " - " + d3 + " число");
        System.out.println(day4 + " - " + d4 + " число");
        System.out.println(day5 + " - " + d5 + " число");
        System.out.println(day6 + " - " + d6 + " число");
        System.out.println(day7 + " - " + d7 + " число");


    }


}
