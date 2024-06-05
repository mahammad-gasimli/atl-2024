package az.atlacademy.tasks.tapsiriqlar150;

import java.util.Scanner;

public class Class007 {
    public static void main(String[] args) {
        System.out.println("Write a Java program that takes a number as input \n" +
                "and prints its multiplication table up to 10.");

        System.out.println("Add a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.println(a + "*"+ i + "=" + a*i);
        }

    }
}
