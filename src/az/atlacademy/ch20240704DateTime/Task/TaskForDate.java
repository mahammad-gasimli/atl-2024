package az.atlacademy.ch20240704DateTime.Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TaskForDate {
    public static void main(String[] args) {
        // 1.Get the Current Time in a Different Time Zone
        ZoneId zoneId = ZoneId.of("Europe/Istanbul");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = zonedDateTime.format(formatter);

        System.out.println("Current time in Istanbul " + zoneId + ": " + formattedDateTime);





        //Calculate the Difference Between Two Dates
        LocalDate startDate = LocalDate.of(1992, 9, 18);
        LocalDate endDate = LocalDate.now();

        long differentDays = endDate.toEpochDay()-startDate.toEpochDay();
        System.out.println(differentDays);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(daysBetween);


        //Subtract Days from a Date

        LocalDate today = LocalDate.now();
        System.out.println("Today " + today);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Tomorrow " + yesterday);



        //Subtract Days from a Date
        System.out.println("Today" + today);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow " + tomorrow);


        //Format Date and Time
        LocalDate date = LocalDate.now(); // Cari tarixi əldə edirik

        // Müxtəlif formatlar müəyyən edirik
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        // Formatlanmış tarixləri çap edirik
        System.out.println("Format 1: gün/ay ədədlə/il " + date.format(formatter1));
        System.out.println("Format 2: il/ay ədədlə/gün " + date.format(formatter2));
        System.out.println("Format 3: gün/ay hərflə/il " + date.format(formatter3));


        //Get the Current Time
        LocalTime currentTim = LocalTime.now();
        System.out.println("Current Time " + currentTim);



    }
}
