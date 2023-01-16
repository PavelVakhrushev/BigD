package Lesson_2_15_1;


public class Week {

    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;

    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;

    int weekNum;


    public Week(int weekNum, int d1, int d2, int d3, int d4, int d5, int d6, int d7) {
        this.weekNum = weekNum;


        day1 = new Day(1);
        day2 = new Day(2);
        day3 = new Day(3);
        day4 = new Day(4);
        day5 = new Day(5);
        day6 = new Day(6);
        day7 = new Day(7);

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


