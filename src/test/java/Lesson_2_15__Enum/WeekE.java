package Lesson_2_15__Enum;

public class WeekE {
    DayE day1;
    DayE day2;
    DayE day3;
    DayE day4;
    DayE day5;
    DayE day6;
    DayE day7;

    int weekNum;

    public WeekE(int weekNum, int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        this.weekNum = weekNum;

        day1 = new DayE(d1, DaysOfWeekE.MONDAY.getNameRussian());
        day2 = new DayE(d2, DaysOfWeekE.TUESDAY.getNameRussian());
        day3 = new DayE(d3, DaysOfWeekE.WEDNESDAY.getNameRussian());
        day4 = new DayE(d4, DaysOfWeekE.THURSDAY.getNameRussian());
        day5 = new DayE(d5, DaysOfWeekE.FRIDAY.getNameRussian());
        day6 = new DayE(d5, DaysOfWeekE.SATURDAY.getNameRussian());
        day7 = new DayE(d7, DaysOfWeekE.SUNDAY.getNameRussian());


    }

    void print() {

        System.out.println(weekNum + " неделя 2022 года:");
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
        System.out.println(day5);
        System.out.println(day6);
        System.out.println(day7);

    }
}
