package az.atlacademy.tasks.eolimp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Task4725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long number = sc.nextLong();
        for (long i = 1; i <= number; i++) {
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}
