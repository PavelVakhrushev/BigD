package Lesson_2_15__Enum;

import static Lesson_2_15__Enum.DaysOfWeekE.*;

public class WeekE {

    DayE day1;
    DayE day2;
    DayE day3;
    DayE day4;
    DayE day5;
    DayE day6;
    DayE day7;

    int weekOfYear;

    public WeekE(int weekNum, int day1, int day2, int day3, int day4, int day5, int day6, int day7 ) {
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
