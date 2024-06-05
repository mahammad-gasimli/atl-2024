package az.atlacademy.tapsiriqlar150;

import java.util.Scanner;

public class Class006 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the sum (addition), multiply, \n" +
                "subtract, divide and remainder of two numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number:");
        int a = sc.nextInt();
        System.out.println("Add second number:");
        int b = sc.nextInt();

        System.out.println("sum of: " + a + "+" + b + "=" + (a+b) );

        System.out.println("subtract: " + a + "-" + b + "=" + (a-b) );

        System.out.println("result: " + a + "*" + b + "=" + (a*b) );
        if(b!=0) {
            System.out.println("Divide " + a + "+" + b + "=" + (a/(float)b));
        } else {
            System.out.println("it isn't possbile ziro");
        }


        System.out.println("remainder: " + a + "%" + b + "=" + (a%b) );


    }
}
