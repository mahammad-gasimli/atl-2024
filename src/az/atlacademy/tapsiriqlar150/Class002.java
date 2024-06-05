package az.atlacademy.tapsiriqlar150;

import java.util.Scanner;

public class Class002 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the sum of two numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number:");
        int a = sc.nextInt();
        System.out.println("Add second number:");
        int b = sc.nextInt();
        System.out.println("sum of " + a + "+" + b + "=" + (a+b) );

    }
}
