package Lesson_2_15__Enum;

import Lesson_2_15_1.Day;

import static Lesson_2_15_1.DaysOfWeek.*;

public class Week {

    Lesson_2_15_1.Day day1;
    Lesson_2_15_1.Day day2;
    Lesson_2_15_1.Day day3;
    Lesson_2_15_1.Day day4;
    Lesson_2_15_1.Day day5;
    Lesson_2_15_1.Day day6;
    Day day7;

    int weekOfYear;

    public Week(int weekNum, int day1, int day2, int day3, int day4, int day5, int day6, int day7 ) {
        weekOfYear = weekNum;
        System.out.println(weekNum + " неделя 2022 года:");
        System.out.println(MONDAY + " - " + day1 + " число");
        System.out.println(TUESDAY + " - " + day2 + " число");
        System.out.println(WEDNESDAY + " - " + day3 + " число");
        System.out.println(THURSDAY + " - " + day4 + " число");
        System.out.println(FRIDAY + " - " + day5 + " число");
        System.out.println(SATURDAY + " - " + day6 + " число");
        System.out.println(SUNDAY + " - " + day7 + " число");


    }

}
