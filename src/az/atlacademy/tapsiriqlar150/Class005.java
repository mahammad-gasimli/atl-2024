package az.atlacademy.tapsiriqlar150;

import java.util.Scanner;

public class Class005 {
    public static void main(String[] args) {
        System.out.println(" Write a Java program that takes two numbers as input \n" +
                "and displays the product of two numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number:");
        int a = sc.nextInt();
        System.out.println("Add second number:");
        int b = sc.nextInt();
        System.out.println("result: " + a + "*" + b + "=" + (a*b) );

    }
}
