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
        LocalDateTime startLD = LocalDateTime.now(); //входная точка для задания по пункту 3
        LocalDate myBirthDayLD = LocalDate.of(1985, 7, 23);
        // дата рождения класса LocalDate
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayLD));
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayLD));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayLD));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(myBirthDayLD));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myBirthDayLD));
        LocalDateTime endLD = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartLDEndLD = Duration.between(startLD, endLD);
        LocalDate nowLocalDate = LocalDate.now();
        long diffMyBirthDayLDNowLD = ChronoUnit.DAYS.between(myBirthDayLD, nowLocalDate);
        System.out.println("Разница между моим днем рождения и текущей датой в формате LocalDate: " +
                diffMyBirthDayLDNowLD);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу LocalDate: " +
                diffStartLDEndLD + '\n' + '\n');

        // класс LocalDateTime
        LocalDateTime startLDT = LocalDateTime.now(); // входная точка для задания по пункту 3
        LocalDateTime myBirthDayLDT = LocalDateTime.of(1985, 7, 23, 5, 17,
                3, 6564);
        // дата рождения класса LocalDateTime
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myBirthDayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myBirthDayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myBirthDayLDT));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayLDT));
        LocalDateTime endLDT = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartLDTEndLDT = Duration.between(startLDT, endLDT);
        LocalDateTime nowLDT = LocalDateTime.now();
        Duration diffMyBirthDayLDTNowLDT = Duration.between(nowLDT, myBirthDayLDT);
        System.out.println("Разница между моим днем рождения и текущей датой в формате LocalDateTime: " +
                diffMyBirthDayLDTNowLDT);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу LocalDateTime: " +
                diffStartLDTEndLDT + '\n' + '\n');

        // класс ZonedDateTime
        LocalDateTime startZDT = LocalDateTime.now(); // входная точка для задания по пункту 3
        ZonedDateTime myBirthDayZDT =
                ZonedDateTime.parse("1985-07-23T05:17:03Z[Europe/Moscow]");
        // дата рождения класса ZonedDateTime
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myBirthDayZDT));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(myBirthDayZDT));
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayZDT));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(myBirthDayZDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myBirthDayZDT));
        LocalDateTime endZDT = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartZDTEndZDT = Duration.between(startZDT, endZDT);
        ZonedDateTime nowZDT = ZonedDateTime.now();
        Duration diffMyBirthDayZDTNowZDT =
                Duration.between(nowZDT, myBirthDayZDT);
        System.out.println("Разница между моим днем рождения и текущей датой в формате ZonedDateTime: " +
                diffMyBirthDayZDTNowZDT);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу ZonedDateTime: " +
                diffStartZDTEndZDT + '\n' + '\n');

        // класс GregorianCalendar
        LocalDateTime startGC = LocalDateTime.now(); // входная точка для задания по пункту 3
        GregorianCalendar myBirthDayGC = new GregorianCalendar(1985, 6, 23,
                05, 17, 03);
        System.out.println(myBirthDayGC.getTime());
        System.out.println(myBirthDayGC.toZonedDateTime());
        System.out.println(DateTimeFormatter.ISO_DATE.format(myBirthDayGC.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(myBirthDayGC.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(myBirthDayGC.toZonedDateTime()));
        LocalDateTime endGC = LocalDateTime.now(); // точка выхода для задания по пункту 3
        Duration diffStartGCEndGC = Duration.between(startGC, endGC);
        GregorianCalendar nowGC = new GregorianCalendar();
        Duration myBirthDayGCNowGC =
                Duration.between(nowGC.toZonedDateTime(), myBirthDayGC.toZonedDateTime());
        System.out.println("Разница между моим днем рождения и текущей датой в формате GregorianCalendar: " +
                myBirthDayGCNowGC);
        System.out.println("Время за которое выполнятеся программа из пункта 1 по классу GregorianCalendar: " +
                diffStartGCEndGC);
    }

}