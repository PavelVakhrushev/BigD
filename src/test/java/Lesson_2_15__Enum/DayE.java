package Lesson_2_15__Enum;


public class DayE {

    int dayOfMonth;
    String dayOfWeek;

    public DayE(int dayOfMonth, String dayOfWeek) {

        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
    }

    public String toString() {
        return dayOfWeek + " - " + dayOfMonth + " число";
    }

}
