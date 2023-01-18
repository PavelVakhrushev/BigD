package Lesson_2_15_1;


public class Week {

    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;

    int weekNum;


    public Week(int weekNum, int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        this.weekNum = weekNum;


        this.day1 = new Day(d1, 1);
        this.day2 = new Day(d2, 2);
        this.day3 = new Day(d3, 3);
        this.day4 = new Day(d4, 4);
        this.day5 = new Day(d5, 5);
        this.day6 = new Day(d6, 6);
        this.day7 = new Day(d7, 7);

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


