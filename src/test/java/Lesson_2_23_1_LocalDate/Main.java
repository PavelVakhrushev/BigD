package Lesson_2_23_1_LocalDate;


import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // класс Date
        LocalDateTime startDay = LocalDateTime.now(); // входная точка для задания по пункту 3
        Date myBirthDayDate = new Date(85, 6, 23, 5, 17, 3);
        //инициализация объекта класса Date с заданной датой
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH").format(myBirthDayDate)); // пункт 1 задания
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH-mm-ss").format(myBirthDayDate));
        // пункт 1 задания
        System.out.println(new SimpleDateFormat().format(myBirthDayDate)); // пункт 1 задания
        LocalDateTime endDay = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartDateEndDate = Duration.between(startDay, endDay);
        Date nowDate = new Date();
        Duration myBirthDayDiffNowDate = Duration.ofMillis(nowDate.getTime() - myBirthDayDate.getTime());
        System.out.println("Разница между моим днем рождения и текущей датой в формате Date: " + myBirthDayDiffNowDate);
        // пункт 2 задания
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу Date: " + diffStartDateEndDate
                + '\n' + '\n'); // пункт 3 и 4 задания

        //класс LocalDate
        LocalDateTime startLocalDate = LocalDateTime.now(); //входная точка для задания по пункту 3
        LocalDate myBirthDayLocalDate = LocalDate.of(1985, 7, 23);
        // дата рождения класса LocalDate
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayLocalDate));
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayLocalDate));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayLocalDate));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(myBirthDayLocalDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myBirthDayLocalDate));
        LocalDateTime endLocalDate = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartLocalDateEndLocalDate = Duration.between(startLocalDate, endLocalDate);
        LocalDate nowLocalDate = LocalDate.now();
        long diffMyBirthDayLocalDateNowLocalDate = ChronoUnit.DAYS.between(myBirthDayLocalDate, nowLocalDate);
        System.out.println("Разница между моим днем рождения и текущей датой в формате LocalDate: " +
                diffMyBirthDayLocalDateNowLocalDate);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу LocalDate: " +
                diffStartLocalDateEndLocalDate + '\n' + '\n');

        // класс LocalDateTime
        LocalDateTime startLocalDateTime = LocalDateTime.now(); // входная точка для задания по пункту 3
        LocalDateTime myBirthDayLocalDateTime = LocalDateTime.of(1985, 7, 23, 5, 17,
                3, 6564);
        // дата рождения класса LocalDateTime
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myBirthDayLocalDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayLocalDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myBirthDayLocalDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myBirthDayLocalDateTime));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayLocalDateTime));
        LocalDateTime endLocalDateTime = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartLocalDateTimeEndLocalDateTime = Duration.between(startLocalDateTime, endLocalDateTime);
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        Duration diffMyBirthDayLocalDateTimeNowLocalDateTime =
                Duration.between(nowLocalDateTime, myBirthDayLocalDateTime);
        System.out.println("Разница между моим днем рождения и текущей датой в формате LocalDateTime: "
                + diffMyBirthDayLocalDateTimeNowLocalDateTime);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу LocalDateTime: "
                + diffStartLocalDateTimeEndLocalDateTime + '\n' + '\n');

        // класс ZonedDateTime
        LocalDateTime startZoneDateTime = LocalDateTime.now(); // входная точка для задания по пункту 3
        ZonedDateTime myBirthDayZonedDateTime =
                ZonedDateTime.parse("1985-07-23T05:17:03Z[Europe/Moscow]");
        // дата рождения класса ZonedDateTime
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayZonedDateTime));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(myBirthDayZonedDateTime));
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayZonedDateTime));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(myBirthDayZonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayZonedDateTime));
        LocalDateTime endZonedDateTime = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartZoneDateTimeEndZonedDateTime = Duration.between(startZoneDateTime, endZonedDateTime);
        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        Duration diffMyBirthDayZonedDateTimeNowZonedDateTime =
                Duration.between(nowZonedDateTime, myBirthDayZonedDateTime);
        System.out.println("Разница между моим днем рождения и текущей датой в формате ZonedDateTime: " +
                diffMyBirthDayZonedDateTimeNowZonedDateTime);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу ZonedDateTime: " +
                diffStartZoneDateTimeEndZonedDateTime + '\n' + '\n');

        // класс GregorianCalendar
        LocalDateTime startGregorianCalendar = LocalDateTime.now(); // входная точка для задания по пункту 3
        GregorianCalendar myBirthDayGregorianCalendar = new GregorianCalendar(1985, 6, 23,
                05, 17, 03);
        System.out.println(myBirthDayGregorianCalendar.getTime());
        System.out.println(myBirthDayGregorianCalendar.toZonedDateTime());
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayGregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(myBirthDayGregorianCalendar.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(myBirthDayGregorianCalendar.toZonedDateTime()));
        LocalDateTime endGregorianCalendar = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartGregorianCalendarEndGregorianCalendar = Duration.between(startGregorianCalendar,
                endGregorianCalendar);
        GregorianCalendar nowGregorianCalendar = new GregorianCalendar();
        Duration myBirthDayGregorianCalendarNowGregorianCalendar =
                Duration.between(nowGregorianCalendar.toZonedDateTime(), myBirthDayGregorianCalendar.toZonedDateTime());
        System.out.println("Разница между моим днем рождения и текущей датой в формате GregorianCalendar: " +
                myBirthDayGregorianCalendarNowGregorianCalendar);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу GregorianCalendar: " +
                diffStartGregorianCalendarEndGregorianCalendar);
    }

}