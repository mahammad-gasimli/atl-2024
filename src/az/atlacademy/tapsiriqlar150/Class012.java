package az.atlacademy.tapsiriqlar150;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class012 {
    public static void main(String[] args) {
        System.out.println("Write a Java program that takes three numbers as \n" +
                "input to calculate and print the average of the numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a = sc.nextFloat();
        System.out.println("Enter the second number:");
        float b = sc.nextFloat();
        System.out.println("Enter the third number:");
        float c = sc.nextFloat();
        System.out.println("Avarge of the three numbers: " + (a+b+c)/3 );
    }
}
