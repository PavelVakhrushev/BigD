package Lesson_2_15__Enum;

public class WeekE {
    DayE day1;
    DayE day2;
    DayE day3;
    DayE day4;
    DayE day5;
    DayE day6;
    DayE day7;

    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;

    int weekNum;

    public WeekE(int weekNum, int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        this.weekNum = weekNum;

        day1 = new DayE(DaysOfWeekE.MONDAY.getNameRussian());
        day2 = new DayE(DaysOfWeekE.TUESDAY.getNameRussian());
        day3 = new DayE(DaysOfWeekE.WEDNESDAY.getNameRussian());
        day4 = new DayE(DaysOfWeekE.THURSDAY.getNameRussian());
        day5 = new DayE(DaysOfWeekE.FRIDAY.getNameRussian());
        day6 = new DayE(DaysOfWeekE.SATURDAY.getNameRussian());
        day7 = new DayE(DaysOfWeekE.SUNDAY.getNameRussian());

        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;

    }

    void print() {

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
