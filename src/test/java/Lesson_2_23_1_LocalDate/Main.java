package Lesson_2_23_1_LocalDate;


import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        LocalDateTime startDay = LocalDateTime.now(); // входная точка для задания по пункту 3
        Date myBirthDayDate = new Date(85, 6, 23, 5, 17, 3);
        //инициализация объекта класса Date с заданной датой
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH-mm-ss").format(myBirthDayDate));
        // пункт 1 задания
        System.out.println(new SimpleDateFormat().format(myBirthDayDate)); // пункт 1 задания
        LocalDateTime endDay = LocalDateTime.now(); // точка выхода для задания по пункту
        Duration diffStartDateEndDate = Duration.between(startDay, endDay);
        Date nowDate = new Date();
        Duration myBirthDayDiffNowDate = Duration.ofMillis(nowDate.getTime() - myBirthDayDate.getTime());
        System.out.println("Разница между моим днем рождения и текущей датой в формате Date: " + myBirthDayDiffNowDate);
        // пункт 2 задания
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу Date: " + diffStartDateEndDate
                + '\n' + '\n'); // пункт 3 и 4 задания

        LocalDateTime startDayGregorianCalendar = LocalDateTime.now();
        GregorianCalendar myBirthDayGregorianCalendar =
                new GregorianCalendar(1985, 6, 23);
        // дата рождения класса GregorianCalendar
        System.out.println(new SimpleDateFormat("yyyy - MM - dd").format(myBirthDayGregorianCalendar));
        System.out.println(new SimpleDateFormat("yyyy - MM - dd - EE").format(myBirthDayGregorianCalendar));
        System.out.println(new SimpleDateFormat("yyyy - MM - dd - EE - HH").format(myBirthDayGregorianCalendar));
        System.out.println(new SimpleDateFormat("yyyy - MM - dd - EE - HH - mm - ss").format(myBirthDayGregorianCalendar));
        System.out.println(new SimpleDateFormat().format(myBirthDayGregorianCalendar));
        LocalDateTime endDayGregorianCalendar = LocalDateTime.now();
        Duration diffStartDayGregorianCalendar = Duration.between(startDayGregorianCalendar, endDayGregorianCalendar);
        GregorianCalendar nowDateGregorianCalendar = new GregorianCalendar();
        Duration myBirthDayGregorianCalendarDiffNowDateGregorianCalendar = Duration.ofMillis();

        LocalDate myBirthDayLocalDate = LocalDate.of(1985, 7, 23); // дата рождения класса LocalDate
        System.out.println(myBirthDayLocalDate);

        LocalDateTime myBirthDayLocalDateTime = LocalDateTime.of(1985, 7, 23, 5, 17, 3, 6564);
        // дата рождения класса LocalDateTime


        ZonedDateTime myBirthDayZonedDateTime =
                ZonedDateTime.of(1988, 7, 23, 5, 17, 3, 60, ZoneId.of("UTC+4"));
        // дата рождения класса ZonedDateTime

    }

}