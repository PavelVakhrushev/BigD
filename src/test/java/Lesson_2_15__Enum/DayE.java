package Lesson_2_15__Enum;


public class DayE {

    int dayOfMonth;
    String dayOfWeek;


    public DayE(String dayOfWeek) {

        this.dayOfWeek = dayOfWeek;

    }

    public String toString() {
        String res;
        res = String.valueOf(dayOfWeek);
        return res;
    }


}
