package az.atlacademy.tapsiriqlar150;

import java.util.Scanner;

public class Class003 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to divide two numbers \n" +
                "and print them on the screen.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number:");
        float a = sc.nextFloat();
        System.out.println("Add second number:");
        float b = sc.nextFloat();
        if(b!=0) {
            System.out.println("Divide " + a + "+" + b + "=" + (a/b));
        } else {
            System.out.println("it isn't possbile ziro");
        }

    }
}
