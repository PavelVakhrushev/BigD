package Lesson_2_15_1;

public class Day {

    String dayOfWeek;
    int dayOfMonth;

    public Day(int dayOfMonth, int dayOfWeek) {
        this.dayOfWeek = DaysOfWeek.Week[dayOfWeek - 1];
        this.dayOfMonth = dayOfMonth;
    }

    public String toString() {

        return dayOfWeek + " - " + dayOfMonth + " число";
    }

}



