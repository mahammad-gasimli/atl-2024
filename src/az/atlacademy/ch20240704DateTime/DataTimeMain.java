package az.atlacademy.ch20240704DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataTimeMain {
    public static void main(String[] args) {
        //Get the Current Date and Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        //Get the Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        //Get the Current Time
        LocalTime now1 = LocalTime.now();
        System.out.println("Current Time: " + now1);

        //Format Date and Time
        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now3.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        //Parse a String to Date
        String dateStr = "2023-07-04";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr, formatter1);
        System.out.println("Parsed Date: " + date);

        //Add Days to a Date
        LocalDate today1 = LocalDate.now();
        LocalDate nextWeek = today1.plusDays(7);
        System.out.println("Date after a week: " + nextWeek);

        //Subtract Days from a Date
        LocalDate today2 = LocalDate.now();
        LocalDate lastWeek = today2.minusDays(7);
        System.out.println("Date a week ago: " + lastWeek);

        //Calculate the Difference Between Two Dates
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 7, 4);
        Period period = Period.between(date1, date2);
        System.out.println("Difference: " + period.getMonths() + " months and " + period.getDays() + " days");

        //Get the Day of the Week for a Date
        LocalDate date3 = LocalDate.of(2023, 7, 4);
        DayOfWeek dayOfWeek = date3.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        //Get the Current Time in a Different Time Zone
        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Time in New York: " + nowInNewYork);









    }
}
