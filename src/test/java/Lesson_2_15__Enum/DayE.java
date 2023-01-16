package Lesson_2_15__Enum;


public class DayE {

    int dayOfMonth;
    DaysOfWeekE dayOfWeek;

    public DayE(DaysOfWeekE dayOfWeek) {

        this.dayOfWeek = DaysOfWeekE.valueOf(String.valueOf(dayOfWeek));

    }

    public String toString() {
        String res;
        res = String.valueOf(dayOfWeek);
        return res;
    }


}
