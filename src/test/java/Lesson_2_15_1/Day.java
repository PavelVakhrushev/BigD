package Lesson_2_15_1;

public class Day {

    String dayOfWeek;
    int dayOfMonth;

    public Day(int dayOfWeek) {
        this.dayOfWeek = DaysOfWeek.Week[dayOfWeek - 1];

    }

    public String toString() {
        String res;
        res = String.valueOf(dayOfWeek);
        return res;
    }

}



