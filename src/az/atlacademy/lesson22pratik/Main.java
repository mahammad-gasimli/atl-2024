package az.atlacademy.lesson22pratik;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;


public class Main {
    public static void main(String[] args) {


        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);

    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {          // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo  = upTo.plusMonths(1);                    // add a month
        }}



    public static void sayHello() {

    }

    public static void sayHello(int a, int b) {

    }
}
